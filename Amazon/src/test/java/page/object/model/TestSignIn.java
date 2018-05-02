package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSignIn extends CommonAPI{

    @Test
    public void testAccountSignIn() throws InterruptedException{

       SignIn signin = PageFactory.initElements(driver, SignIn.class);
        System.out.println(driver.getTitle()+ " " + driver.getCurrentUrl());
        signin.signIn();
    }
}