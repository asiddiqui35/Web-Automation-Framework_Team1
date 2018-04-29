package home.page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchFriends extends CommonAPI {
    @FindBy(id="js_ua")
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
}
