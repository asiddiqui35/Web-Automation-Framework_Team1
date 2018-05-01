package home.page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Language extends CommonAPI {

    @FindBy(linkText = "EnglishUs")
    WebElement english;
    @FindBy(xpath = "//*[@id=\"pageFooter\"]/ul/li[2]/a")
    WebElement Spanish;

    public void smallTest() throws InterruptedException {
        PageFactory.initElements(driver, this);
        Thread.sleep(3000);
        Spanish.click();
        return;
        //english.click();



    }
}