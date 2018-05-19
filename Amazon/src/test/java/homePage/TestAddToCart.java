package homePage;

import searching.AddToCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAddToCart extends AddToCart {

    @Test
    public void testSearchItem() throws InterruptedException {

        AddToCart searchitem = PageFactory.initElements(driver, AddToCart.class);
        System.out.println(driver.getTitle()+" " + driver.getCurrentUrl());
        searchitem.search();
    }
}