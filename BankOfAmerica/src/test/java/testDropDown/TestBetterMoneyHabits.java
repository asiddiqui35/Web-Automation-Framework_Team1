package testDropDown;

import dropDown.BetterMoneyHabits;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import sun.jvm.hotspot.debugger.Page;

public class TestBetterMoneyHabits extends BetterMoneyHabits {
    @Test
    public void testSelectBetterMoneyHabits(){
        BetterMoneyHabits bm = PageFactory.initElements(driver, BetterMoneyHabits.class);
        bm.selectBetterMOneyHabits();
    }
    @Test
    public void testSelectMerrilWealthManagement(){
        BetterMoneyHabits bm = PageFactory.initElements(driver, BetterMoneyHabits.class);
        bm.selectMerrillWealthManagement();
    }
}
