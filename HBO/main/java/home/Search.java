package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class Search extends CommonAPI{

    @FindBy(xpath="//div[@class='bands/MainNavigation--searchIcon'][1]")
    public WebElement searchInputField;
    @FindBy(xpath="//input[@placeholder='Search'and@class='components/Search--searchInput']")
    public WebElement searchName;

    public WebElement getSearchName() {
        return searchName;
    }
    public void setSearchName(WebElement searchName) {
        this.searchName = searchName;
    }
    public List<String> getItemValue(){
        List<String > itemList = new ArrayList<String >();
        itemList.add("Game of Thrones");
        itemList.add("Prison Break");
        itemList.add("Walking Dead");
        itemList.add("Lost");
        return itemList;
    }
    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputField = searchInputField;
    }
    public WebElement getSearchInputField() {
        return searchInputField;
    }
    public void searchNames() {
        List<String> itemlist = getItemValue();
        for (String items : itemlist) {
            getSearchName().click();
            //getSearchInputField() is equivalnet to -->driver.findElements(By.cssSelector(locator));
            getSearchInputField().sendKeys(items, Keys.ENTER);
        }
    }
}
