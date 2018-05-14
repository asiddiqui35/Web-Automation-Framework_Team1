package dataDriven;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task extends CommonAPI {
    @FindBy(css ="#headerSearch")
    public WebElement searchBox;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }
    public void lookoutTask(){
        getSearchBox();
    }



}
