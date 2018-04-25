package home.page;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPageFB extends HomePageFB {

    @Test
    public void testcheckBrowser() {

        driver.findElement(By.xpath("//input[@class='inputtext' and @name='email']")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("");
       // driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
        Assert.assertEquals( checkBrowser(),"Facebook - Log In or Sign Up");
        }
     public void Registration(){
        driver.findElement(By.cssSelector("//*[@id=\"u_0_o\"]")).sendKeys();
     }




}
