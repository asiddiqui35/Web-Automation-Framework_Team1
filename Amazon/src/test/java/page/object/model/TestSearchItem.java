package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.object.model.search.SearchItem;

public class TestSearchItem extends SearchItem {

    @Test
    public void testSearchItem() throws InterruptedException {

        SearchItem searchitem = PageFactory.initElements(driver, SearchItem.class);
        System.out.println(driver.getTitle()+" " + driver.getCurrentUrl());
        searchitem.search();
    }
}