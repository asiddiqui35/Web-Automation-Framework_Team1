package home.page;

import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends CommonAPI{
    public String checkBrowser() {
        String title = driver.getTitle();
        return title;
    }

    public void checkSignIn() {
        driver.findElement(By.id("email")).sendKeys("bmaya2013@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("abc123@");
        driver.findElement(By.cssSelector("#loginbutton")).click();
        }


        }













