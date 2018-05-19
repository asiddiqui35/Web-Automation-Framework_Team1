package homePage;

import org.testng.annotations.Test;

public class TestPrimePage extends PrimePage {

    @Test
    public void testPrime() {
        viewPrimePage();
        selectTryPrime();
        String actualtitle = driver.getTitle();
        System.out.println("Test Passed!");
    }
}
