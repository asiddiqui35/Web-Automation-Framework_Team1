package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import home.page.model.HomePage;

public class TestHomePage extends HomePage {
    @Test// test 1
    public void search()throws InterruptedException{
        HomePage pp =PageFactory.initElements(driver,HomePage.class);
        pp.getSearchInput();
        pp.getSearchBtn();
        pp.clickPlan(driver);
        pp.searchDoctors(driver);
        pp.searchLocation(driver);

    }

}

