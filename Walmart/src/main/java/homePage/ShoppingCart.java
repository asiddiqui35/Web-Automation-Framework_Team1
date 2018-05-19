package homePage;
import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCart extends CommonAPI {
    @FindBy(xpath = "/html/body/div/div/div[1]/header/div/div[3]/div/div[3]/div/a/div/span[1]")
    WebElement popUpCloseBtn;
    public void shoppingCart() {
        System.out.println("Helper Method");
        WebDriverWait wait = new WebDriverWait(driver, 35);

        wait.until(ExpectedConditions.elementToBeClickable(popUpCloseBtn));
        popUpCloseBtn.click();


    }
}
