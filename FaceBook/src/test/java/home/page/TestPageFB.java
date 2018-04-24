package home.page;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPageFB extends HomePageFB {

    @Test
    public void TestcheckBrowser() {
        Assert.assertEquals( checkBrowser(),"Facebook - Log In or Sign Up");
        driver.findElement(By.xpath("//input[@class='inputtext' and @name='email']")).sendKeys("maya813r@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("@mirtumi001");
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        }
    @Test
    public void NewsFeedLink() {
        driver.findElement(By.xpath("//*[@id=\"navItem_217974574879787\"]/a/div")).click();

    }

}
