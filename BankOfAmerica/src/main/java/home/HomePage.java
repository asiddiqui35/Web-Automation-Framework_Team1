package home;
import base.CommonAPI;
import org.apache.xpath.operations.String;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import reporting.TestLogger;


public class HomePage extends CommonAPI {
    public void checkHomePage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        java.lang.String title = driver.getTitle();
        Assert.assertEquals(title, "Bank of America - Banking, Credit Cards, Home Loans and Auto Loans");
        System.out.println("Unit Testing: passed");
    }
    public void checkLanguage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCss("#NAV_EN_ES");
    }
    public void locationDropdown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCss("#footer_bofa_locations");
        clickOnCss("#rioSearchFilterLabel");
        clickByXpath("//input[@value='4413']");
    }
}
