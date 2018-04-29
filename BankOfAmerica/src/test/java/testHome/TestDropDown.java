package testHome;

import home.DropDown;
import org.testng.annotations.Test;

public class TestDropDown extends DropDown {
    @Test
    public void testDropDown() {
        printDropDown();
    }
    @Test
    public void testSelectDropDown(){
        clickOnDropdownMenu();
    }
}