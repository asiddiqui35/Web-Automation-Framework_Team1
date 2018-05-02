package home.page.model;

import base.CommonAPI;
import org.omg.CORBA.INITIALIZE;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigningUp extends CommonAPI {
    @FindBy(xpath="//*[@id=\"dnn_ctr2267_HtmlModule_lblContent\"]/div[2]/a[1]/div")
     public WebElement Members;
    @FindBy(xpath = "//*[@id=\"dnn_ctr449_HtmlModule_lblContent\"]/div[1]/a/div")
    public WebElement LoginIN;
    @FindBy(id="dnn_ctr1185_View_txtEmail")
    public WebElement Email;
    @FindBy(name="dnn$ctr1185$View$txtPassword")
    public WebElement Password;
    @FindBy(name="dnn_ctr1185_View_btnLogin")
    public WebElement LoginBtn;
//   @FindBy (id="dnn_dnnUser_enhancedRegisterLink")
//    public WebElement Register;
//    @FindBy(xpath ="//a[text()='Register'][1]")
//    public  WebElement Register;
    public void registration() {
        Members.click();
    }
    public WebElement getLoginIN() {
        return LoginIN;
    }
    public void setLoginIN(WebElement loginIN) {
        this.LoginIN = loginIN;
    }
    public void loginPage()throws InterruptedException{
        getLoginIN().click();
        Thread.sleep(1000);
    }
    public void email(){
        Email.sendKeys("abc123@yahoo.com");
        Password.sendKeys("abc123");
        LoginBtn.click();


   }




}


