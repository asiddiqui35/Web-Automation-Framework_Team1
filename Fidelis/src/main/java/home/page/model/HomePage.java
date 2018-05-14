package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {
    @FindBy(id = "headerSearch")
    public WebElement SearchInput;
    @FindBy(css = "#dnn_ctr2267_HtmlModule_lblContent > div:nth-child(3) > div > em")
    public WebElement searchBtn;
    @FindBy(tagName = "a")
    public List<WebElement>list;

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

    public List<WebElement> getList() { return list; }

    public void setList(List<WebElement> list) { this.list = list; }


    public void checkLanguage()throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCss("#dnn_dnnLANGUAGE_lblLanguage");
    }

    public void clickPlan(WebDriver driver) throws InterruptedException {
        getSearchBtn().click();
        getSearchInput().clear();
        getSearchInput().sendKeys("Plans", Keys.ENTER);
        getSearchBtn().click();
        Thread.sleep(2000);
        driver.navigate().back();
    }
    public void searchDoctors(WebDriver driver) throws InterruptedException {
        getSearchBtn().click();
        getSearchInput().clear();
        getSearchInput().sendKeys("Doctors", Keys.ENTER);
        Thread.sleep(2000);
    }
    public void searchLocation(WebDriver driver) throws InterruptedException {
        getSearchBtn().click();
        getSearchInput().clear();
        getSearchInput().sendKeys("Locations", Keys.ENTER);
        Thread.sleep(2000);
    }
    public void findNumLinkHomePage() throws Exception {
        List<WebElement> link = getList();
        for (WebElement aa : link) {
            System.out.println(aa.getAttribute("href"));

        }

    }
}

