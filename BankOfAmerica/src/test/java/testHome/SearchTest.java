package testHome;

import home.Search;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchTest extends Search{
    @Test
    public void testSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInSearchBox();
        }
}
