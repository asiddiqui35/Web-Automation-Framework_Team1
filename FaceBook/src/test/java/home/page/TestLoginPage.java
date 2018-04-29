package home.page;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLoginPage extends CommonAPI {

    @Test
    public void testingSignIn() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);


    }
}






