package home;
import base.CommonAPI;
import org.apache.xpath.operations.String;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class HomePage extends CommonAPI {
    public void checkHomePage(){
       java.lang.String title = driver.getTitle();
        Assert.assertEquals(title, "Bank of America - Banking, Credit Cards, Home Loans and Auto Loans");
        System.out.println("Unit Testing: passed");
    }
    public void checkLanguage(){
        clickOnCss("#NAV_EN_ES");
    }
    public void locationDropdown(){
        clickOnCss("#footer_bofa_locations");
        clickOnCss("#rioSearchFilterLabel");
        clickOnCss("#spid4413");
    }
}
