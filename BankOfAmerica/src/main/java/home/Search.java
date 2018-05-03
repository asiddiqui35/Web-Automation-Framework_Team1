package home;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

import static net.sourceforge.htmlunit.cyberneko.HTMLEntities.get;

public class Search extends CommonAPI {
    public void searchInSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<String>();
        list.add("Location");
        list.add("e-banking");
        list.add("monthly fees");
        for(String topic: list) {
            typeByCssNEnter("#nav-search-query", topic);
            driver.navigate().refresh();
        }
    }
}
