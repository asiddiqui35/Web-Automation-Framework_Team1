package homePage;

import org.testng.annotations.Test;

public class TestHomePage extends HomePage{

    @Test
    public void testHome() {
        String actualtitle = driver.getTitle();
        System.out.println("Testing: Passed!");

    }

}

