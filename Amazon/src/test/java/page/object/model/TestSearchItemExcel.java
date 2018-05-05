package page.object.model;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.object.model.search.SearchItemsExcel;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchItemExcel extends SearchItemsExcel {

    @Test
    public void TestExcel() throws IOException {
        testExcel();
    }
}