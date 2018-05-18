package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class Search extends CommonAPI{

    @FindBy(xpath = "//div/input[@class='components/Search--searchInput']")
    public WebElement searchInputField;
    @FindBy(xpath="//div[@class='bands/MainNavigation--searchIcon'][1]")
    public WebElement searchName;

    public WebElement getSearchName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchName;
    }
    public void setSearchName(WebElement searchName) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.searchName = searchName;
    }
    public List<String> getItemValue(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String > itemList = new ArrayList<String >();
        itemList.add("Game of Thrones");
        itemList.add("Prison Break");
        itemList.add("Walking Dead");
        itemList.add("Lost");
        return itemList;
    }
    public void setSearchInputField(WebElement searchInputField) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.searchInputField = searchInputField;
    }
    public WebElement getSearchInputField() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchInputField;
    }
    public void searchNames() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemlist = getItemValue();
        for (String items : itemlist) {
            getSearchName().click();
            //getSearchInputField() is equivalnet to -->driver.findElements(By.cssSelector(locator));
            getSearchInputField().sendKeys(items, Keys.ENTER);
        }
    }
}
