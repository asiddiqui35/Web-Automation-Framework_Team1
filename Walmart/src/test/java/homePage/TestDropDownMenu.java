package homePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDropDownMenu extends MenuPage{
    @Test
    public void menu(){
        readMenuText();
    }

    @Test
    public void testDropDownMenu(){
        TestDropDownMenu dropDownMenu = PageFactory.initElements(driver, TestDropDownMenu.class);
        dropDownMenu.dropDown();
    }
    @Test
    public void testMouseHover(){
        TestDropDownMenu dropDownMenu = PageFactory.initElements(driver, TestDropDownMenu.class);
        dropDownMenu.mouseHover(); }


}
