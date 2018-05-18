package page.object.model.search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.DataReader;
import java.io.IOException;

public class SearchItems extends CommonAPI {
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInputWebElement;
    DataReader dr = new DataReader();
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir") + "data/file1.xls";
        String[] data = dr.fileReader2(path, 1);
        return data;
    }
    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        String path = System.getProperty("user.dir") + "data/file1.xls";
        String[] data = dr.fileReader2(path, 1);
        return data;
    }
}