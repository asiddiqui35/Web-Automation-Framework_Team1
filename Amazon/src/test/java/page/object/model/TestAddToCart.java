package page.object.model;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.object.model.search.AddToCart;

public class TestAddToCart extends AddToCart {

    @Test
    public void testSearchItem() throws InterruptedException {

        AddToCart searchitem = PageFactory.initElements(driver, AddToCart.class);
        System.out.println(driver.getTitle()+" " + driver.getCurrentUrl());
        searchitem.search();
    }
}