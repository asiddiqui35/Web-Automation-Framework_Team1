package data.driven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemSearch extends JDBC {
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

    public WebElement getSearchBox() {
        return searchBox;
    }

    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }
    public void readingfromSqlNsearching() throws Exception {
        List<String> items = readingfromSql();
        for (String text : items) {
            getSearchBox().sendKeys(text);
            getSearchButton().click();
        }
    }
}

