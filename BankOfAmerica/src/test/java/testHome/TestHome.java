package testHome;

import home.HomePage;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHome extends HomePage{
    @Test
    public void testHome(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkHomePage();
    }
    @Test
    public void testLanguage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkLanguage();
    }
    @Test
    public void testLocationDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locationDropdown();
        }
}
