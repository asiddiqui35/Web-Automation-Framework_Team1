package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.sql.Driver;

public class SearchTest extends Search {
    @Test //test2
    public void testSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Search pf = PageFactory.initElements(driver,Search.class);
        pf.searchNames();
    }


}
