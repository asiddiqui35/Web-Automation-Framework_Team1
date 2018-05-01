package dataDrivenTest;

import dataDriven.TVSerieses;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TVSeriesesTest extends TVSerieses{
    @Test
    public void searchTVSerieses() throws IOException {
        TVSerieses obj = PageFactory.initElements(driver,TVSerieses.class);
        clickSearchIcon();
        obj.getSearchInpuField();
    }
}
