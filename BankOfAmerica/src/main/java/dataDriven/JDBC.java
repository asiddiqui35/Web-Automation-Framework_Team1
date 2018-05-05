package dataDriven;

import base.CommonAPI;
import database.ConnectDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class JDBC extends CommonAPI {
    @FindBy(css = "#nav-search-query")public WebElement searchBox;
    @FindBy(xpath = "//input[@alt='Search']") public WebElement searchButton;
    public WebElement getSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchBox;
    }
    public void setSearchBox(WebElement searchBox) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.searchBox = searchBox;
    }
    public WebElement getSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchButton;
    }
    public void setSearchButton(WebElement searchButton) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.searchButton = searchButton;
    }
    public void clearSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchBox().clear();
    }
    public void clickSerachButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchButton().click();
    }
    ConnectDB connectDB = new ConnectDB();
    public void retriveMysqlTableDataAndSearch() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      List<String> topics = connectDB.readDataBase("SearchTopic","topic");
      for(String st:topics){
          getSearchBox().sendKeys(st);
         clickSerachButton();
         clearSearchBox();
      }
    }
}
