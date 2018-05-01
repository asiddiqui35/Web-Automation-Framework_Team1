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
    public void  clickPlan(WebDriver driver)throws InterruptedException {
        getSearchBtn().click();
        getSearchInput().clear();
        getSearchInput().sendKeys("Plans", Keys.ENTER);
        getSearchBtn().click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
    }
    public void searchDoctors(WebDriver driver)throws InterruptedException {
        getSearchBtn().click();
        getSearchInput().clear();
        getSearchInput().sendKeys("Doctors", Keys.ENTER);
        Thread.sleep(2000);
        driver.navigate().back();
    }
    public void searchLocation(WebDriver driver)throws InterruptedException{
        Thread.sleep(2000);
        getSearchBtn().click();
        getSearchInput().clear();
        getSearchInput().sendKeys("Locations", Keys.ENTER);
        Thread.sleep(2000);
        driver.navigate().back();
    }
    public void collectAlllink() {


    }

}
