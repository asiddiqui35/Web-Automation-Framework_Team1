package home.page.model;

import base.CommonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkPage extends CommonAPI {
    @FindBy(linkText = "Products")
    public WebElement Products;

    public WebElement getProducts() { return Products; }
    public void setProducts(WebElement products) { this.Products = products; }
    public void linkPage(WebDriver driver) throws InterruptedException {
        getProducts().click();
        Thread.sleep(2000);
        driver.navigate().back();
    }
}
