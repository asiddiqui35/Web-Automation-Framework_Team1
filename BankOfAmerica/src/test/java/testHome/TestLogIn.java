package testHome;

import home.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogIn extends LogIn {
    @Test
    public void logIn(){
        //creating object using pageFactory
        LogIn login = PageFactory.initElements(driver, LogIn.class);
        login.enterUserName();
        login.enterPassword();
        login.clickSignIn();
    }
}
