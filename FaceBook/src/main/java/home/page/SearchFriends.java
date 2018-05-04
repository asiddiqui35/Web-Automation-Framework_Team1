package home.page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchFriends extends CommonAPI {
    @FindBy(id="/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[1]/div[2]/div/form/div/div/div/div/input[2]")

    public WebElement search;

    public WebElement getSearchInputField() {
        return search;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.search= searchInputField;
    }

    public void searchforpeople() {
        List<String> itemList = getItemValue();
        for (String st : itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("jenny");
        itemsList.add("john");
        itemsList.add("kate");
        itemsList.add("Rishi");

        return itemsList;
    }
    public void logIn() throws InterruptedException {
        LoginPage lg = PageFactory.initElements(driver,LoginPage.class);
        lg.email();
        lg.passWord();
        lg.clickingLogin();
        sleepFor(3);
    }
}
