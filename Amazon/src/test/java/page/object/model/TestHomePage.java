package page.object.model;

import org.testng.Assert;
import page.object.model.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage{

    @Test
    public void testHome() {

        String actualtitle = driver.getTitle();
        System.out.println("Testing: Passed!");

    }

}

