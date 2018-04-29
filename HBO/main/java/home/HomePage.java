package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends CommonAPI {
    public void clickSearch(){
       clickByXpath("//div[@class='bands/MainNavigation--searchIcon'][1]");
    }
    public void putNames(){
    typeByXpath("//input[@placeholder='Search']","Game of Thrones");
    }
    public void refresh(){
        driver.navigate().refresh();
    }
    public void chekHomeTabElements(){
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
       clickOnCss(".__player-placeholder-play-button");
        driver.switchTo();
    }
}

