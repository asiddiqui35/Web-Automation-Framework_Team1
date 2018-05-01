package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSigningUp extends SigningUp{
    @Test
    public void beAmember()throws InterruptedException {
        SigningUp sUp = PageFactory.initElements(driver, SigningUp.class);
        sUp.registration();
        sUp.loginPage();
        sUp.email();

        }
}
