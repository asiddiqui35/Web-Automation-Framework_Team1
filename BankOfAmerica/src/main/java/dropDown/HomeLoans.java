package dropDown;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLoans extends CommonAPI {
    @FindBy(xpath = "//span[text()='Home Loans']")public WebElement momeLoans;
    @FindBy(id = "mortgages")public WebElement mortgages;
    @FindBy(id="refinance")public WebElement refinance;
    @FindBy(id = "homeEquity")public WebElement homeEquity;
    @FindBy(id = "findAHome")public WebElement findHome;
    @FindBy(id = "firstTimeHomeBuyer")public WebElement firsTimeHomeBuyer;
}
