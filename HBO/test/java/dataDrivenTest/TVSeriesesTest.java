package dataDrivenTest;

import dataDriven.TVSerieses;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TVSeriesesTest extends TVSerieses{

    @Test
    public void searchTVSerieses() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TVSerieses obj = PageFactory.initElements(driver,TVSerieses.class);
        clickSearchIcon();
        obj.searchTVShowsEnter();
    }
}
