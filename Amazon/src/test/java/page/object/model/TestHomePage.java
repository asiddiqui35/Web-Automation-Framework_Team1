package page.object.model;

import org.testng.Assert;
import page.object.model.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage{

    @Test
    public void testHome(){
        viewHomePage();

        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle,"Amazon.com: Amazon Prime");
        System.out.println("Testing: Passed");
    }

}
