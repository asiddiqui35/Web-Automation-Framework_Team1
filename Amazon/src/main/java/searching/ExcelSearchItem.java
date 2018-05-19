package searching;

import base.CommonAPI;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelSearchItem extends CommonAPI{

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
            ArrayList<String> searchAbleItems = dataFromExcel("/Users/kaniz/Web-Automation-Framework_Team1/Amazon/data/file1.xls","Sheet1",1);
            for (int i = 0; i < searchAbleItems.size(); i++) {

                typeByXpath("//*[@id=\"twotabsearchtextbox\"]", searchAbleItems.get(i));
                clearInputField("//*[@id=\"nav-search\"]/form/div[2]/div/input");
            }
        }
    }

