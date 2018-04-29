package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestWalmartHelp extends CommonAPI{
    public void help () throws InterruptedException {
        WalmartPickUp pickUp = PageFactory.initElements(driver, WalmartPickUp.class);
        System.out.println(driver.getTitle()+ " " + driver.getCurrentUrl());
        pickUp.menu();
    }
}

    
