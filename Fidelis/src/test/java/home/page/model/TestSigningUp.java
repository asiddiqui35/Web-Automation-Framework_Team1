package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSigningUp extends SigningUp{
    @Test
    public void memberPage ()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SigningUp signingup = PageFactory.initElements(driver, SigningUp.class);
        signingup.clickOnLogin();
    }
}
