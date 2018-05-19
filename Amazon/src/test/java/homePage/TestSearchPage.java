package homePage;

import base.CommonAPI;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class TestSearchPage extends CommonAPI{

    @Test
    public void test1() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItems();
    }

    @Test
    public void search(){
        typeOnCss("#twotabsearchtextbox","iPhone");
        clickOnCss(".nav-input");
    }
}
