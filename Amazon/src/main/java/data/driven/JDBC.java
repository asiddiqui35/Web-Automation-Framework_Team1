package data.driven;

import base.CommonAPI;
import database.ConnectDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JDBC extends CommonAPI {

    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    public WebElement searchButton;


    public WebElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }

    public void clearSearchBox

    public WebElement getSearchBox() {
        return searchBox;
    }

    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }

    ConnectDB connectDB = new ConnectDB();

    public void readingfromsqlNsearching() throws Exception {
        List<String> item = connectDB.readDataBase("searchItem", "item");
        for (String text : item) {
            getSearchBox().sendKeys(text);
            getSearchButton().click();

        }
    }
}