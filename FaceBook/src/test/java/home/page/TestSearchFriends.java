package home.page;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchFriends extends SearchFriends {
    @Test
    public void searchFriends() throws InterruptedException {
        SearchFriends sc = PageFactory.initElements(driver,SearchFriends.class);
        logIn();
        driver.navigate().refresh();
        sc.searchforpeople();
    }
}