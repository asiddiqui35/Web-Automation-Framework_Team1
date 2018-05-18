package page.object.model;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestJDBC extends JDBC {
    @Test
    public void chekConnetion() throws Exception {
        JDBC jdbc = PageFactory.initElements(driver, JDBC.class);
        jdbc.readingMysqlTable();
    }
}

