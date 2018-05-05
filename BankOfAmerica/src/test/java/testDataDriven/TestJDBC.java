package testDataDriven;

import dataDriven.JDBC;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestJDBC extends JDBC {
    @Test
    public void chekConnetion() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JDBC jdbc = PageFactory.initElements(driver,JDBC.class);
        jdbc.retriveMysqlTableDataAndSearch();
    }
}
