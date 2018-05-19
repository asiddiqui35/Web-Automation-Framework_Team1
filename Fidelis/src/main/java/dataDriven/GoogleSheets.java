package dataDriven;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.By;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleAPIs.GoogleShetsReader2.getSheetsService;


public class GoogleSheets extends CommonAPI {
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
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
            clickOnCss("#headerSearch");
            typeByCssNEnter("#headerSearch", row.get(0).toString());
            driver.findElement(By.id("headerSearch")).clear();
        }

    }

}
