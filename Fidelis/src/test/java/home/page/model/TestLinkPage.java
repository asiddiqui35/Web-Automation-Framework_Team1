package home.page.model;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class TestLinkPage extends LinkPage{
    @Test
    public void LinkPagee()throws InterruptedException {
        LinkPage linkpage = PageFactory.initElements(driver, LinkPage.class);
        linkpage.getProducts().click();
        linkpage.getFindADoctor().click();

    }

}
