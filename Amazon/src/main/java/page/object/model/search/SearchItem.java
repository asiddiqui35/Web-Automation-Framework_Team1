package page.object.model.search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchItem extends CommonAPI{

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchItem;

    @FindBy(className = "nav-input")
    WebElement click;

    @FindBy(xpath = "//*[@id=\"result_2\"]/div/div[4]/div[1]/a/h2")
    WebElement chooseItem;

    @FindBy(className = "a-button-input")
    WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"hlb-ptc-btn-native\"]")
    WebElement checkOut;

    @FindBy(xpath = "//input[@type='email']")
    WebElement inPutEmail;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement clickConinue;

    public void search() {

        searchItem.sendKeys("ipad air 2 case");
        click.click();
        chooseItem.click();
        addToCart.click();
        checkOut.click();
        inPutEmail.sendKeys("nizizidiot@gmail.com");
        clickConinue.click();

    }

}
