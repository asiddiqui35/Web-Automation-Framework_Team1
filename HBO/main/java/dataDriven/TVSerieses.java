package dataDriven;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import utility.DataReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TVSerieses extends CommonAPI {

    @FindBy(xpath= "//input[@placeholder='Search'and@class='components/Search--searchInput']")
    public  WebElement searchInpuField;

    public  WebElement getSearchInpuField() {
        return searchInpuField;
    }

    public void setSearchInpuField(WebElement searchInpuField) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.searchInpuField = searchInpuField;
    }

    public void clickSearchIcon() {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");
    }
    public void searchFor(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInpuField().sendKeys(value, Keys.ENTER);
    }
    public void searchTVShowsEnter() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ReadFiles readFiles =new ReadFiles();
        String[] value = readFiles.getDataFromExcelFile();
        for (int i = 1; i < value.length; i++) {
           searchFor(value[i]);
        }
    }
}

