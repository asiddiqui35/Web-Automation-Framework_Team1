package page.object.model;
import data.driven.JDBC;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestJDBC extends JDBC {
    @Test
    public void checkConnection() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        JDBC jdbc = PageFactory.initElements(driver, JDBC.class);
        jdbc.readingfromsqlNsearching();
    }
}
