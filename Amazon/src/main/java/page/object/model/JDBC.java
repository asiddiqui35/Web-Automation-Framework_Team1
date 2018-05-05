package page.object.model;

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

    public WebElement getSearchBox() {
        return searchBox;
    }

    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }

    ConnectDB connectDB = new ConnectDB();
    public void readingMysqlTable() throws Exception {
        List<String> topics = connectDB.readDataBase("SearchItem","item");
        for(String st:topics){
           getSearchBox().sendKeys(st);
           getSearchButton().click();
           getSearchBox().clear();
        }
    }
}
