package home.page.model;

import base.CommonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkPage extends CommonAPI {
    @FindBy(linkText = "Products")
    public WebElement Products;
    @FindBy(linkText = "Find A Doctor")
    public WebElement FindADoctor;

    public WebElement getProducts() {
        return Products;
    }
    public void setProducts(WebElement products) {
        this.Products = products;
    }
    public void products(WebDriver driver) throws InterruptedException {
        getProducts().click();
        Thread.sleep(2000);
        driver.navigate().back();
    }
    public WebElement getFindADoctor() {
        return FindADoctor;
    }

    public void setFindADoctor(WebElement findADoctor) {
        this.FindADoctor = findADoctor;
    }
    public void findadoctor(WebDriver driver) throws InterruptedException{
        getFindADoctor().click();
        Thread.sleep(2000);
        driver.navigate().back();
    }


}
