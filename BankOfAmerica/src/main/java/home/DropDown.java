package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;

import java.util.List;

public class DropDown extends CommonAPI {
    public void printDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCss("#NAV_CONTACT_US");
        String str = getTextByXpath("//select[@id='stateListId']");
        System.out.println(str);
    }
    public void clickOnDropdownMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.cssSelector("#NAV_CONTACT_US")).click();
        clickByXpath("//select[@id='stateListId']");
        clickByXpath("//*[@id=\"stateListId\"]/option[4]");
        }
    }
