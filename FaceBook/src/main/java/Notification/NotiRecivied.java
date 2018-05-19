package Notification;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotiRecivied {
    @FindBy(name = "notifications")
    WebElement jewelBtn;

    public WebElement getJewelBtn() {
        return jewelBtn;
    }
    public void setJewelBtn(WebElement jewelBtn) {
        this.jewelBtn = jewelBtn;
    }
}




