package TestKeyWord;

import KeyWordDriven.Features;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
public class TestKey extends Features {
    @Test
    public void testKeyWord() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectFeatures(driver);
    }
}
