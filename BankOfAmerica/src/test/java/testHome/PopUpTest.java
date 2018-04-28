package testHome;

import home.PopUp;
import org.testng.annotations.Test;

public class PopUpTest extends PopUp{
    @Test
    public void testPopUp(){
        goToPopUp();
        popUpClick(driver);
    }
    @Test
    public void testPopUpWrite() {
        goToPopUp();
        popUpWrite(driver);
    }
}
