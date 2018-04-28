package testHome;

import home.HomePage;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;

public class TestHome extends HomePage{
    @Test
    public void testHome(){
        checkHomePage();
    }
    @Test
    public void testLanguage(){
        checkLanguage();
    }
    @Test
    public void testLocationDropDown(){
        locationDropdown();
        }
}
