package home.page.model;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEvents extends SearchEvents {
    @Test
    public void evenNearme(){

         SearchEvents searchevents =PageFactory.initElements(driver,SearchEvents.class);
        searchevents.searchForevent();
    }
}

