package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import home.page.model.HomePage;

public class TestHomePage extends HomePage {
    @Test
    public void search(){
        HomePage pp =PageFactory.initElements(driver,HomePage.class);
        pp.getSearchInput();
        pp.getSearchBtn();
    }
}

