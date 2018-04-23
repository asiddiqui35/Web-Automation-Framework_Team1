package home.page;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPageFB extends HomePageFB {

    @Test
    public void TestcheckBrowser() {

     Assert.assertEquals( checkBrowser(),"Facebook - Log In or Sign Up");


    }

    /*public void CheckSignIn()*/


}
