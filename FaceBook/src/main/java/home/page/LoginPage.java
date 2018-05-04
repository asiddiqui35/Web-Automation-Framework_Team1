package home.page;

import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class LoginPage extends CommonAPI{
    @FindBy(id = "u_0_2")
    public WebElement Login;
    @FindBy(name = "pass")
    public WebElement Password;
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement Email;

    public WebElement getPassword() {
        return Password;
    }
    public void setPassword(WebElement password) {
        Password = password;
    }
    public WebElement getLogin() {
        return Login;
    }
    public void setLogin(WebElement login) {
        Login = login;
    }
    public WebElement getEmail() {
        return Email;
    }

    public void setEmail(WebElement email) {
        this.Email = email;
    }


    public void email() {
        getEmail().sendKeys("bmaya2013@gmail.com");
    }
    public void passWord() {
        Password.sendKeys("abc123@");
    }

    public void clickingLogin() {
        Login.click();

    }
}














