package home.page.model;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.LinkedList;

public class TestLinkPage extends LinkPage{
    @Test
    public void LinkPagee()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LinkPage linkpage = PageFactory.initElements(driver, LinkPage.class);
        linkpage.getProducts().click();
        linkpage.getFindADoctor().click();
        }
}
