package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.annotations.Test;

public class DropDownMenu extends CommonAPI{

    //@Test1
    @FindBy(xpath = "//*[@id=\"nav-link-shopall\"]/span[2]")
    WebElement openDepartment;

    //@Test2
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/div[1]/div/a[1]")
    WebElement selectAllVideos;

    //@Test3
    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]/span[1]")
    WebElement clickPrimeMusic;

    //@Test4
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/div[3]/div/a[3]")
    WebElement selectGames;

    //@Test5
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/div/a[9]")
    WebElement meetAlexa;

    //@Test6
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/div/a[1]")
    WebElement amazonFresh;

    //@Test7
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/a[2]")
    WebElement babyStore;

    //@Test8
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/div/a[1]")
    WebElement amazonHome;

    //@Test9
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[2]/div/a[1]")
    WebElement shopWomen;

    //@Test10
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/div[5]/div/a[1]")
    WebElement amazonKindle;

    //@Test11
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/div[8]/div/a[1]")
    WebElement FireTV;

    //@Test12
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[3]/div/a[1]")
    WebElement books;

    //@Test13
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/div/a[1]")
    WebElement Echo;

    //@Test14
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[2]/div/a[2]")
    WebElement shopMen;

    //@Test15
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[3]/div/a[2]")
    WebElement shopJewlery;

    //@Test16
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[3]/div/a[3]")
    WebElement handBags;

    //@Test17
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[3]/div/a[5]")
    WebElement homeDecore;

    //@Test18
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[3]/div/a[6]")
    WebElement artWork;

    //@Test19
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[3]/div/a[5]")
    WebElement textbooks;

    //@Test20
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[5]/div/a[6]")
    WebElement health;

    //@Test21
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[7]/div/a[8]")
    WebElement gift;

    //@Test22
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/img")
    WebElement beauty;

    public void d() throws InterruptedException {

        openDepartment.click();
        selectAllVideos.click();
        clickPrimeMusic.click();
        selectGames.click();
        meetAlexa.click();
        amazonFresh.click();
        babyStore.click();
        //amazonHome.click();
        //shopWomen.click();
        //amazonKindle.click();
        //FireTV.click();
        //books.click();
        //Echo.click();
        //shopMen.click();
        //shopJewlery.click();
        //handBags.click();
        //homeDecore.click();
        //artWork.click();
        //textbooks.click();
        //health.click();
        //gift.click();
        beauty.click();
    }
}
