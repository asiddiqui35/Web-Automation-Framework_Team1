package googlesheet;

import base.CommonAPI;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

import static googleAPIs.GoogleShetsReader2.getSheetsService;

public class GoogleSheet extends CommonAPI {
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    public void searchItemByName(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : values) {
            waitUntilClickAble(By.xpath("//*[@id=\"global-search-input\"]"));
            driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).sendKeys(row.get(0).toString(),Keys.ENTER);
            driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).clear();
        }
    }
}
