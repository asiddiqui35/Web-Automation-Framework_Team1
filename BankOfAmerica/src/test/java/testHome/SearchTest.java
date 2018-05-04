package testHome;

import home.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.Serializable;

public class SearchTest extends Search{
    @Test
    public void testSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Search sc = PageFactory.initElements(driver, Search.class);
        sc.searchInSearchBox();
        }
}
