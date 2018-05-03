package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigningUp extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"dnn_ctr2267_HtmlModule_lblContent\"]/div[2]/a[1]")
    public WebElement Members;


    public void registration() throws InterruptedException {
        Members.click();
        Thread.sleep(2000);
//    }
//    public void Loggin(){
//        LoginIn.click();
//    }public void EmailInput(){
//        EmailAdd.sendKeys("maya123@gmail.com");
//    }
    }

}





