package page.object.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownMenu {

    @FindBy(xpath = "//*[@id=\"nav-link-shopall\"]")
    WebElement openDepartment;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[1]/span")
    WebElement primeVideo;

    public void d() throws InterruptedException {
        openDepartment.click();
        primeVideo.click();

    }
}
