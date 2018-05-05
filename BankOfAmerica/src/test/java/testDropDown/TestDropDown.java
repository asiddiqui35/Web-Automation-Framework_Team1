package testDropDown;

import dropDown.PrintDropDown;
import org.testng.annotations.Test;

public class TestDropDown extends PrintDropDown {
    @Test
    public void printDropDownMenu(){
        getAllItemsInDropdown();
    }
}
