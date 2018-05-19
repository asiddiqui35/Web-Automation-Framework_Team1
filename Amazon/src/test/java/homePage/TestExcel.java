package homePage;

import org.testng.annotations.Test;
import searching.ExcelSearchItem;

import java.io.IOException;

public class TestExcel extends ExcelSearchItem{

        @Test
        public void TestExcel() throws IOException {
            testExcel();
        }
    }
