package homePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestWalmartPickUp extends WalmartPickUp{

    @Test
    public void pickUp () throws InterruptedException {
        WalmartPickUp pickUp = PageFactory.initElements(driver, WalmartPickUp.class);
        System.out.println(driver.getTitle()+ " " + driver.getCurrentUrl());
        pickUp.menu();
    }
}

