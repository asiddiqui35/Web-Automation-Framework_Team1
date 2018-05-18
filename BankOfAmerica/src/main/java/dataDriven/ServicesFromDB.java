package dataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ServicesFromDB extends JDBC {
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
    public void services() throws Exception {
        for (String st : retriveMysqlTableDataAndSearch()) {
            getSearchBox().sendKeys(st);
            clickSerachButton();
            clearSearchBox();
        }
    }
}
