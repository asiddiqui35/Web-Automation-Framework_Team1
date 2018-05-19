package page.object.model;

import base.CommonAPI;
import org.testng.Assert;

public class HomePageAsserts extends CommonAPI {
    public void checkHomePage(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Walmart.com | Save Money. Live Better.");
        System.out.println("Testing: Passed");
    }
}


