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
    @FindBy(linkText ="News and Events")
    public  WebElement newandEvents;

    public WebElement getNewandEvents() { return newandEvents; }

    public void setNewandEvents(WebElement newandEvents) { this.newandEvents = newandEvents; }

    public WebElement getProducts() {
        return Products;
    }

    public void setProducts(WebElement products) {
        this.Products = products;
    }

    public void products(WebDriver driver) throws InterruptedException {
        getProducts().click();
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
        driver.navigate().back();
    }
    public void newsandEvent(WebDriver driver){
        getNewandEvents().click();
        driver.navigate().back();
    }


}
