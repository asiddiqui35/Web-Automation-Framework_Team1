package home.page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FrontPage extends HomePageFB {
    public void newsFeedLink() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(3000);
        //Clicking on the NewFeedLink
        driver.findElement(By.cssSelector("#navItem_4748854339 > a > div")).click();
    }
}


