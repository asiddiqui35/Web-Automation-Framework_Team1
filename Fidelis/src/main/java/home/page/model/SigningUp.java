package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.servlet.Registration;

public class SigningUp extends CommonAPI {
    JavascriptExecutor je = (JavascriptExecutor) driver;

//    @FindBy(css = "#dnn_ctr2267_HtmlModule_lblContent > div.hidden-xs.style\\3d > a:nth-child(1) > div")
//    public WebElement Members;
//    @FindBy(xpath ="//span[@style='font-size: 16px;'][contains(text(),'Log In')]")
//    public WebElement logIn;

    @FindBy(css = "#dnn_ctr2267_HtmlModule_lblContent > div.hidden-xs.style\\3d > a:nth-child(1) > div")
    public WebElement Members;
//    @FindBy(css ="#dnn_ctr449_HtmlModule_lblContent > div:nth-child(9) > a > div > span")
    @FindBy(css ="#dnn_ctr449_HtmlModule_lblContent > div:nth-child(9) > a")
    public WebElement logIn;


    public void jsclick(WebElement element){
        je.executeScript("arguments[0].scrollIntoView(True);",element);
        je.executeScript("arguments[0].click();",element);

               }
    public void loginnnnn (){
        Members.click();
        delay(5);
//        logIn.click();

        jsclick(logIn);
        delay(4);

    }

    public void delay(int x){
        try {
            Thread.sleep(x*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//    public void members() throws InterruptedException {
//        Members.click();
//        Thread.sleep(2000); }
//    public void LogiN() throws InterruptedException{
//        logIn.click();
//        Thread.sleep(20000);}
//    }




//*[@class="hero
//
//
// button"]//*[contains(text(),'Log In')]
//
//    }






