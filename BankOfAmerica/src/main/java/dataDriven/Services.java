package dataDriven;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;
import java.util.List;

public class Services extends CommonAPI {
    @FindBy(css = "#nav-search-query")
    public WebElement searchBox;
    @FindBy(xpath = "//input[@alt='Search']") public WebElement searchButton;
    public WebElement getSearchButton() {
        return searchButton;
    }
    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }
    public WebElement getSearchBox() {
        return searchBox;
    }
    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }
    static DataReader dr = new DataReader();
    public String[] getDataFromExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir") + "/data/file.xls";
        String[] data = dr.fileReader2(path, 1);
        return data;
    }
    public void searchableSerivices() throws IOException {
        String[] list = getDataFromExcelFile();
        for (String service: list){
            getSearchBox().sendKeys(service);
            getSearchButton().click();
            getSearchBox().clear();
        }
    }
}
