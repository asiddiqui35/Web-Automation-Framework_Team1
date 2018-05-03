package dataDriven;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import utility.DataReader;
import java.io.IOException;

public class TVSerieses extends CommonAPI {

    @FindBy(xpath= "//input[@placeholder='Search'and@class='components/Search--searchInput']")
    public  WebElement searchInpuField;

    public  WebElement getSearchInpuField() {
        return searchInpuField;
    }

    public void setSearchInpuField(WebElement searchInpuField) {
        this.searchInpuField = searchInpuField;
    }

    public void clickSearchIcon() {
        clickByXpath("//div[@class='bands/MainNavigation--searchIcon'][1]");
    }

    public void searchFor(String value) {
        getSearchInpuField().sendKeys(value, Keys.ENTER);
    }

    public void searchTVShowsEnter() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ReadFiles rd =new ReadFiles();
        String[] value = rd.getDataFromExcelFile();
        for (int i = 0; i < value.length; i++) {
            searchFor(value[i]);
            clickSearchIcon();
        }
    }
}

