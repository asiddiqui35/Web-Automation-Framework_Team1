package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import home.page.model.HomePage;
import reporting.TestLogger;

public class TestHomePage extends HomePage {
    @Test// test 1
    public void search() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getSearchInput();
        homePage.getSearchBtn();
        homePage.clickPlan(driver);
        homePage.searchDoctors(driver);
        homePage.searchLocation(driver);
        homePage.findNumLinkHomePage();


    }
}

