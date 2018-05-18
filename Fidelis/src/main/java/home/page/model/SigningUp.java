package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.servlet.Registration;
import java.util.ArrayList;
import java.util.List;

public class SigningUp extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"dnn_ctr2267_HtmlModule_lblContent\"]/div[2]/a[1]/div")
    public WebElement Members;
    @FindBy(xpath = "//*[@id='dnn_ctr449_HtmlModule_lblContent']/div[1]/a/div/span")
    public WebElement LogInn;
    public void loginnnnn() {
        Members.click();

    }
    public void clickOnLogin() throws InterruptedException {
        Members.click();
        LogInn.click();
        sleepFor(4);
    }
    public void Tab(Integer switchTo) {
        ArrayList<String> Tabs = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(Tabs.get(switchTo));
    }

}


















