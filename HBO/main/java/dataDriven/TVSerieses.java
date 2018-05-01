package dataDriven;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DataReader;
import java.io.IOException;

public class TVSerieses extends CommonAPI {


    @FindBy(xpath = "//input[@placeholder='Search'and@class='components/Search--searchInput']")
    public WebElement searchInpuField;
    public WebElement getSearchInpuField() {
        return searchInpuField;
    }
    public void setSearchInpuField(WebElement searchInpuField) {
        this.searchInpuField = searchInpuField;
    }
   static DataReader dr = new DataReader();

    public static String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir") + "/data/file.xls";
        String[] data = dr.fileReader2(path, 0);
        return data;
    }
    public void clickSearchIcon() {
        clickByXpath("//div[@class='bands/MainNavigation--searchIcon'][1]");
    }
}

