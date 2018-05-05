package dropDown;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Savings extends CommonAPI {
    @FindBy(xpath = "//span[text()='Savings']")public WebElement savings;
    @FindBy(id = "rewardsSavingsAccount")public WebElement rewadsSavingsAccount;
    @FindBy(id="cdAccount")public WebElement cdAccount;
    @FindBy(id = "iraAccount")public WebElement iraAcccount;
}
