package homePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDropDownMenu extends DropDownMenu {

    @Test

    public void testDropDownMenu() throws InterruptedException {
        DropDownMenu ddm = PageFactory.initElements(driver, DropDownMenu.class);
        System.out.println(driver.getTitle()+ " " + driver.getCurrentUrl());
        ddm.d();
    }
}
