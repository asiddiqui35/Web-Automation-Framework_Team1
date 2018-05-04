package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigningUp extends CommonAPI {
    JavascriptExecutor je = (JavascriptExecutor) driver;
    WebElement element = driver.findElement(By.xpath("//*[@id=\"dnn_ctr449_HtmlModule_lblContent\"]/div[2]/a/div/span"));


}

    public WebElement getEasyselftoolLinkText() {
        return easyselftoolLinkText;
    }

    public void setEasyselftoolLinkText(WebElement easyselftoolLinkText) {
        this.easyselftoolLinkText = easyselftoolLinkText;
    }
    public void scroll(String locator){
       je.executeScript("arguments[0].scrollIntoView(true);",element);

        }
}






    //    @FindBy(xpath = "//*[@id=\"dnn_ctr2267_HtmlModule_lblContent\"]/div[2]/a[1]")
//    public WebElement Members;
//
//
//    public void registration() throws InterruptedException {
//        Members.click();
//        Thread.sleep(2000);
//
//    }






