package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuPage extends CommonAPI{
    public void readMenuText(){
        List<String> menu = getTextFromWebElements(".btn-fake-link option");
        for (String test:menu) {
            System.out.println();
        }
    }
    Actions actions = new Actions(driver);

    @FindBy(css = "#header-OffcanvasNav-topLinks--link display-block")
    WebElement ReorderItems;

    @FindBy(xpath = "//*[@id=\"LHN-2\"]")
    WebElement ElectronicsOffice;

    @FindBy(xpath = "//*[@id=\"LHN-3\"]")
    WebElement MoviesMusicBooks;

    @FindBy(xpath = "//*[@id=\"LHN-7\"]")
    WebElement BabyTodler;

    public void dropDown(){
        actions.moveToElement(ReorderItems).moveToElement(ElectronicsOffice).click().build().perform();
    }
    public void mouseHover(){
        actions.moveToElement(ReorderItems).moveToElement(MoviesMusicBooks).moveToElement(BabyTodler).click().build().perform();
    }
}
