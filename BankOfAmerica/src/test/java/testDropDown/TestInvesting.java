package testDropDown;

import dropDown.Investing;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestInvesting extends Investing {
    @Test
    public void testSelectInvesting(){
        Investing investing = PageFactory.initElements(driver,Investing.class);
        investing.selectInvesting();
    }
}
