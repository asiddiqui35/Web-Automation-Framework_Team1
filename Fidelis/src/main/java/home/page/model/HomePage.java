package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    @FindBy(id = "headerSearch")
    public WebElement SearchInput;
    @FindBy(css = "#dnn_ctr2267_HtmlModule_lblContent > div:nth-child(3) > div > em")
    public WebElement searchBtn;

    public WebElement getSearchInput() {
        return SearchInput;
    }

    public void setSearchInput(WebElement searchInput) {
        this.SearchInput = searchInput;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public void setSearchBtn(WebElement searchBtn) {
        this.searchBtn = searchBtn;
    }


}
