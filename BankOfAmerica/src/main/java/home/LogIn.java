package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends CommonAPI{
    @FindBy(id="onlineId1")
   public  WebElement username;
    @FindBy(id="passcode1")
    public WebElement password;
    @FindBy(id="signIn")
    public WebElement signin;
    public void enterUserName(){
        username.sendKeys("aftabrabbi3");
    }
    public void enterPassword(){
        password.sendKeys("xxxxxx");
    }
    public void clickSignIn(){
        signin.click();
    }
}
