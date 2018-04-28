package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn {

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[2]")
    WebElement account;

    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement inputEmail;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement proceed;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[3]/div/div[1]/div[1]/a/div/div/div/div[2]/h3")
    WebElement myOrders;


    public void signIn(){
        account.click();
        inputEmail.sendKeys("nizizidiot@gmail.com");
        proceed.click();
        password.sendKeys("myamazon");
        submit.click();
        myAccount.click();
        myOrders.click();

    }

}
