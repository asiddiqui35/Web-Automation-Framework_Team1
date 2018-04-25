package page.object.model;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestPrimePage extends PrimePage {

    @Test
    public void testHome(){
        viewPrimePage();

        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle,"Amazon.com: Amazon Prime");
        System.out.println("Testing: Passed");
    }

}
