//package page.object.model;
//
//
//import base.CommonAPI;
//import home.SearchItem;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//import page.object.model.search.SearchItem;
//import reporting.TestLogger;
//
//import java.io.IOException;
//
//public class TestSearchItem extends CommonAPI {
//
//    @Test
//    public void test2() throws InterruptedException{
//        SearchItem searchItem = PageFactory.initElements(driver, SearchItem.class);
//        searchItem.SearchItem();
//    }
//
//    @Test
//    public void test3() throws InterruptedException, IOException{
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
//        searchPage.searchItemsAndSubmitButton();
//    }
//}
//
//}
