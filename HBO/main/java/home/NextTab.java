package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;

public class NextTab extends CommonAPI{
    public void clickOnLink(){
        driver.findElement(By.xpath("//a[@href='https://hbocareers.com/']")).click();
    }
    public WebDriver netxTab(){
        handleNewTab(driver);
//        String oldTab = driver.getWindowHandle();
//        List<String> newTabs = new ArrayList<String>(driver.getWindowHandles());
//        newTabs.remove(oldTab);
        //driver.switchTo().window(newTabs.get(0));
        clickByXpath("//*[@id=\"section-featured-jobs\"]/div[2]/table/tbody/tr[5]/td[1]/a");
        return driver;
    }

}
