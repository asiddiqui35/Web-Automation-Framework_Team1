package googlesheet;

import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheet extends GoogleSheet{
        // AMZ_TS5: Use google sheets test data to search multiple items
        // AMZ_TS5_TC1: Search multiple items by name from a google sheets file
        @Test
        public void testSearchTopic() throws IOException, InterruptedException {
            TestLogger.log(convertToString("C: " + getClass().getSimpleName()) + " - M: " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            int i = 0;
            String spreadsheetId = "1bnDNQF9p7pFMV3SGvKNrkRZjZn3HbE3mygykfPb8oF8";
            String range = "Sheet1!A1:A10";
            searchItemByName(spreadsheetId, range);
            }

        }

