package testDataDriven;

import dataDriven.JDBC;
import dataDriven.ServicesFromDB;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import javax.xml.ws.Service;

public class TestServicesFromDB extends ServicesFromDB {
    @Test
    public void chekConnetion() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ServicesFromDB servicesFromDB = PageFactory.initElements(driver,ServicesFromDB.class);
        servicesFromDB.services();
    }
}
