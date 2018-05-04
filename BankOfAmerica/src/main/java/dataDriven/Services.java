package dataDriven;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Services extends CommonAPI{
    @FindBy(css = "#nav-search-query")
    public WebElement searchBox;


}
