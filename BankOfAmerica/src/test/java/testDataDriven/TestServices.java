package testDataDriven;

import dataDriven.Services;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestServices extends Services {
    @Test
    public void testSerchableServices() throws IOException {
        Services services = PageFactory.initElements(driver,Services.class);
        services.searchableSerivices();
    }
}
