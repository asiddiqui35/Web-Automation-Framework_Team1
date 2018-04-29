package home.page;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLoginPage extends CommonAPI {

    @Test
    public void TestLoginPage() throws InterruptedException{
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        System.out.println(driver.getTitle()+" "+driver.getCurrentUrl());
        loginpage.LoginPage();
    }
}






