package page.object.model;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchItemsExcel extends SearchItemsExcel {
    @Test
    public void TestExcel() throws IOException {
        testExcel();
    }
}