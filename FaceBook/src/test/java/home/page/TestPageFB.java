package home.page;

import org.testng.annotations.Test;

public class TestPageFB extends HomePageFB{
    @Test
    public void CheckBrowser() {driver.getTitle();}

}
