package home.page;

import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends CommonAPI{

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement Email;
    @FindBy(name = "pass")
    WebElement Password;
    @FindBy(id = "u_0_2")
    WebElement Login;

    public void enterEmail() {
        Email.sendKeys("bmaya2013@gmail.com");
    }
    public void enterPassword() {
        Password.sendKeys("abc123@");
    }
    public void clickLogin(){
        Login.click();
    }
}















