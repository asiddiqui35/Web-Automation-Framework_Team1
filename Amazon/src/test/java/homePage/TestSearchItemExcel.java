package homePage;

import searching.SearchItemsExcel;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSearchItemExcel extends SearchItemsExcel {

    @Test
    public void TestExcel() throws IOException {
        testExcel();
    }
}