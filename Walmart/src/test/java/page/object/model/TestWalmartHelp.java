package page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestWalmartHelp {


    private WebDriver driver;

    public void help () throws InterruptedException {

        WalmartPickUp pickUp = PageFactory.initElements(driver, WalmartPickUp.class);
        System.out.println(driver.getTitle()+ " " + driver.getCurrentUrl());
        pickUp.menu();
    }
}

    
