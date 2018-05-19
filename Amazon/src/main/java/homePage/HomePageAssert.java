package homePage;

import base.CommonAPI;
import org.testng.Assert;

public class HomePageAssert extends CommonAPI {

    public void checkHomePage(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
        System.out.println("Testing: Passed");
    }
}
