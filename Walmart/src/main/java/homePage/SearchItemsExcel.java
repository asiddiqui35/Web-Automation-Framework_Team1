package homePage;

import base.CommonAPI;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import utility.DataReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class SearchItemsExcel extends CommonAPI {

    public ArrayList<String> dataFromExcel(String path, String sheetName, int columnNo) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet s = wb.getSheet(sheetName);
        Iterator<Row> rowIT = s.iterator();
        ArrayList<String> list = new ArrayList<String>();
        while (rowIT.hasNext()) {
            list.add(rowIT.next().getCell(columnNo).getStringCellValue());
        }
        return list;
    }
    public void testExcel() throws IOException {
        ArrayList<String> searchAbleItems = dataFromExcel("/Users/selinatanha/Web-Automation-Framework_Team1/Walmart/Data/file1.xls","Sheet1",1);
        for (int i = 0; i < searchAbleItems.size(); i++) {
            typeByXpath("//*[@id=\"global-search-form\"]/div/div[3]/div/button/span[2]", searchAbleItems.get(i));
            clearInputField("//*[@id=\"global-search-input\"]");
        }//*[@id="global-search-form"]/div/div[3]/div/button/span[2]
    }
}