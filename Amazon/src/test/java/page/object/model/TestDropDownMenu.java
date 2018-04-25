package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDropDownMenu extends CommonAPI{

    @Test
    public void testDropDownMenu() throws InterruptedException {
        DropDownMenu dropDownMenu = PageFactory.initElements(driver, DropDownMenu.class);
        System.out.println(driver.getTitle() + " " + driver.getCurrentUrl());
        dropDownMenu.menu();
    }
}