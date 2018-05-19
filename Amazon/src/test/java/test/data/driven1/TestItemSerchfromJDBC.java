package test.data.driven1;


import data.driven.ItemSearch;
import data.driven.JDBC;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestItemSerchfromJDBC extends ItemSearch {
    @Test
    public void checkConnetion() throws Exception {
        ItemSearch itemSearch = PageFactory.initElements(driver, ItemSearch.class);
        itemSearch.readingfromSqlNsearching();
    }
}

