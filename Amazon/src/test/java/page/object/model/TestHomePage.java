package page.object.model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    @Test
    public void testHomePage() {
        openHomePage();

        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
        System.out.println("Testing: Passed");

    }
}