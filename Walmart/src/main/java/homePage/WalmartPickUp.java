package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalmartPickUp extends CommonAPI{

    //@Test1
    @FindBy(xpath = "//*[@id=\"header-GlobalEyebrowNav-link-0\"]")
    WebElement pickUpToday;

    @FindBy(xpath = "//*[@id=\"categoryAppCenterContent\"]/div[1]/span/div[4]/div/div/div[4]/div/a/img")
    WebElement shopToys;

    @FindBy(xpath = "//*[@id=\"searchProductResult\"]/ul/li[3]/div/div/div[5]/div/span[2]/a/span")
    WebElement selectUNO;
    public void menu() throws InterruptedException {
        pickUpToday.click();
        shopToys.click();
        selectUNO.click();
    }
}

