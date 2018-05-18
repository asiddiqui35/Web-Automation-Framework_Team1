package page.object.model;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.object.model.search.ExcelSearchItem;
import reporting.TestLogger;

import java.io.IOException;

public class TestExcel extends ExcelSearchItem{

        @Test
        public void TestExcel() throws IOException {
            testExcel();
        }
    }
