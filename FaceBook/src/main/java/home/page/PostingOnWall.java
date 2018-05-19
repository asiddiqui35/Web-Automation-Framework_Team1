package home.page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class PostingOnWall extends CommonAPI {
    @FindBy(css="._1mf")
    WebElement postBox;
    public WebElement getPostBox() {
        return postBox;
    }

    public void setPost(WebElement postBox) {
        this.postBox = postBox;
    }
    public void postOnWall(){
        getPostBox().sendKeys("hello");
    }
    public void clickOnHome(){
        clickByXpath("//a[text()='Home']");
    }
    public void cliOnMakePost(){
        clickByXpath("//span[text()='Make Post']");
    }
    public void logIn() throws InterruptedException {
        LoginPage lg = PageFactory.initElements(driver,LoginPage.class);
        lg.email();
        lg.passWord();
        lg.clickingLogin();
    }
}
