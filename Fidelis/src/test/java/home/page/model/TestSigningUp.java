package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSigningUp extends SigningUp{
    @Test
    public void linkpagee ()throws InterruptedException {
        SigningUp sUp = PageFactory.initElements(driver, SigningUp.class);
        sUp.linktextpage(driver);
//        sUp.Loggin();
//        sUp.EmailInput();
        }
}
