package page.object.model;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchPage {
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInputField;

    public WebElement getSearchInputField() {
        return searchInputField;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputField = searchInputField;
    }

    public void searchItems() {
        List<String> itemList = getItemValue();
        for (String st : itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
    public List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Harry Potter");
        itemsList.add("Coffee Mug");
        itemsList.add("Laptop");
        itemsList.add("Baby Wipes");
        return itemsList;
    }
}