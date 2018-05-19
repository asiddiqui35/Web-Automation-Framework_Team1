package homePage;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestSearchItemsExcel extends SearchItemsExcel {
    @Test
    public void TestExcel() throws IOException {
        testExcel();
    }
}