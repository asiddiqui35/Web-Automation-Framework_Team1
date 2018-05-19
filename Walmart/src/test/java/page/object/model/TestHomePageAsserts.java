package page.object.model;

import org.testng.annotations.Test;

public class TestHomePageAsserts extends HomePageAsserts {
    @Test
    public void testHomeAssert(){
        checkHomePage();
    }
}
