package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import reporting.TestLogger;

public class HomePage extends CommonAPI {
    public void clickSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       clickByXpath("//div[@class='bands/MainNavigation--searchIcon'][1]");
    }
    public void putNames(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    typeByXpath("//input[@placeholder='Search']","Game of Thrones");
    }
    public void refresh(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().refresh();
    }
    public void chekHomeTabElements(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//div[@class='bands/MainNavigation--searchIcon'][1]");
        refresh();
        clickByXpath("//a[@target='_self' and @rel='noopener'][1]");
        refresh();
        clickByXpath("//a[@href='/movies'][1]");
        refresh();
        clickByXpath("//a[contains(text(),'Boxing')][1]");
        refresh();
        clickByXpath("//a[contains(text(),'Boxing')][1]");
        refresh();
        System.out.println(getCurrentPageUrl());
    }
    public void playTrailer(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCss(".__player-placeholder-play-button");
        driver.switchTo();
    }
}

