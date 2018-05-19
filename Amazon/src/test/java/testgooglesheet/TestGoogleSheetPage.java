package testgooglesheet;

import GoogleSheet.GoogleSheetsPage;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetPage extends GoogleSheetsPage {

    @Test
    public void amazonSearch() throws IOException, InterruptedException {
        TestLogger.log(convertToString("C: " + getClass().getSimpleName()) + " - M: " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        int i = 0;
        String spreadsheetId = "1N6j-SjK82O6RidD4B29janFq3TnRQ5Au8BmgxVAIHEQ";
        String range = "Sheet1!A1:A7";
        searchItemByName(spreadsheetId, range);
    }
}