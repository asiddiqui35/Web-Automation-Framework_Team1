package home.page;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLoginPage extends LoginPage{



    @Test
    public void signIn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.email();
//        loginPage.passWord();
//        loginPage.clickingLogin();

    }



}






