package testDataDriven;

import googleSheetsApi.GoogleSheetsPage;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends GoogleSheetsPage {
    @Test
    public void testSerchTopic() throws IOException, InterruptedException {
        TestLogger.log(convertToString("C: " + getClass().getSimpleName()) + " - M: " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        int i = 0;
        String spreadsheetId = "14E2XNlMeQTogo1NUbyUaBcMWb5cbfZzk4HDI6wH7nvg";
        String range = "Sheet1!A1:A4";
        searchItemByName(spreadsheetId, range);
    }
}
