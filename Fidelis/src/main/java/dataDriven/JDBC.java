package dataDriven;

import base.CommonAPI;
import database.ConnectDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class JDBC extends CommonAPI {
    @FindBy(css = "#headerSearch")
    public WebElement searchBox;
    @FindBy(css=".headerSearch")
    public WebElement searchBtn;


    public WebElement getSearchBtn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        return searchBtn;
    }
    public void setSearchBtn(WebElement searchBtn) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.searchBtn = searchBtn;
    }
    public WebElement getSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchBox;
    }
    public void setSearchBox(WebElement searchBox) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.searchBox = searchBox;
    }
    ConnectDB connectDB = new ConnectDB();
    public void readingfromsqlNsearching() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> topics = connectDB.readDataBase("searchInfo","topic");
        for(String text:topics){
       getSearchBox().sendKeys(text);
       getSearchBtn().click();
       }
    }
}
