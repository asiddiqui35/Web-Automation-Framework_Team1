package home;
import base.CommonAPI;
import org.testng.Assert;


public class HomePage extends CommonAPI {
    public void checkHomePage(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Bank of America - Banking, Credit Cards, Home Loans and Auto Loans");
        System.out.println("Unit Testing: passed");
    }
}
