package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SignIn extends CommonAPI {

    //@Test1

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[2]")
    WebElement account;

    //@Test2
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement inputEmail;

    //@Test3
    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement proceed;

    //@Test4
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement password;

    //Test5
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement submit;

    //Test6
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement myAccount;

    //Test7
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[3]/div/div[1]/div[1]/a/div/div/div/div[2]/h3")
    WebElement myOrders;


    public void sn(){
        account.click();
        inputEmail.sendKeys("nizizidiot@gmail.com");
        proceed.click();
        password.sendKeys("xxxxxxxx");
        submit.click();
        myAccount.click();
        myOrders.click();

    }

}
