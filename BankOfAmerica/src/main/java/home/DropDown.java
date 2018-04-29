package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropDown extends CommonAPI {
    public void printDropDown(){
        driver.findElement(By.cssSelector("#NAV_CONTACT_US")).click();
        String str = getTextByXpath("//select[@id='stateListId']");
        System.out.println(str);
    }
    public void clickOnDropdownMenu() {
        driver.findElement(By.cssSelector("#NAV_CONTACT_US")).click();
        clickByXpath("//select[@id='stateListId']");
        clickByXpath("//*[@id=\"stateListId\"]/option[4]");
        }
    }
