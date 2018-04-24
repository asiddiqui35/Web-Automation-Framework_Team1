package home.page;

import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFB extends CommonAPI{
    public String checkBrowser() {
        String title = driver.getTitle();
        return title;
    }
    public void checkSignIn(){
        driver.findElement(By.id("email")).sendKeys("UserName");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("login")).sendKeys("Login");
        driver.findElement(By.id("forgot account")).click();
        }
    public void registration(){

    }












}
