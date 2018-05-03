package testKeyWordDrive;

import keyWordDriven.Features;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestKeyWord extends Features {
    @Test
    public void testKeyWord() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectFeatures(driver);
    }
}
