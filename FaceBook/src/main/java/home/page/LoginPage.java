package home.page;

import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage{

    @FindBy(xpath ="//*[@id=\"email\"]")
    WebElement Email;

    @FindBy(name ="pass")
    WebElement Password;

    @FindBy(id="u_0_2")
    WebElement Login;

    public void LoginPage() {
    Email.sendKeys("bmaya2013@gmail.com");
    Password.sendKeys("abc123@");
    Login.click();
    }

//
//
//
//
//
// public String checkBrowser() {
//        String title = driver.getTitle();
//        return title;
//        }
//    public void checkSignIn() {
//        driver.findElement(By.id("email")).sendKeys("bmaya2013@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("abc123@");
//        driver.findElement(By.cssSelector("#loginbutton")).click();
    }














