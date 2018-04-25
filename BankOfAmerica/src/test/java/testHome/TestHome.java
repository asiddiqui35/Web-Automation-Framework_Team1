package testHome;

import home.HomePage;
import org.testng.annotations.Test;

public class TestHome extends HomePage{
    @Test
    public void testHome(){

        checkHomePage();
    }
}
