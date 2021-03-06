package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.annotations.Test;

public class DropDownMenu extends CommonAPI{

    @FindBy(xpath = "//*[@id=\"nav-link-shopall\"]/span[2]")
    WebElement openDepartment;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/div[1]/div/a[1]")
    WebElement selectAllVideos;

    @FindBy(xpath = "//*[@id=\"content\"]/div[8]/div/div[1]/h2[2]/a")
    WebElement selectSeeMoreMovies;

    @FindBy(xpath = "//*[@id=\"result_2\"]/div/div/div/div[2]/div[1]/div/a/h2")
    WebElement selectThor;

    @FindBy(xpath = "//*[@id=\"dv-action-box\"]/form/span/input")
    WebElement watchList;

    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement enterEmail;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement clickContinue;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]/span[1]")
    WebElement clickPrimeMusic;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/div[3]/div/a[3]")
    WebElement selectGames;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/div/a[9]")
    WebElement meetAlexa;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/div/a[1]")
    WebElement amazonFresh;

   @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/a[2]")
    WebElement babyStore;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/div/a[1]")
    WebElement amazonHome;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[2]/div/a[1]")
    WebElement shopWomen;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/div[5]/div/a[1]")
    WebElement amazonKindle;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/div[8]/div/a[1]")
    WebElement FireTV;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[3]/div/a[1]")
    WebElement books;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/div/a[1]")
    WebElement Echo;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[2]/div/a[2]")
    WebElement shopMen;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[3]/div/a[2]")
   WebElement shopJewlery;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[3]/div/a[3]")
    WebElement handBags;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[3]/div/a[5]")
    WebElement homeDecore;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[3]/div/a[6]")
    WebElement artWork;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[3]/div/a[5]")
    WebElement textbooks;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[5]/div/a[6]")
    WebElement health;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[7]/div/a[8]")
    WebElement gift;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/img")
    WebElement beauty;

    public void d() throws InterruptedException {
        openDepartment.click();
        selectAllVideos.click();
        selectSeeMoreMovies.click();
        selectThor.click();
        watchList.click();
        enterEmail.sendKeys("nizizidiot@gmail.com");
        clickContinue.click();
        inputPassword.sendKeys("xxxxxxxxx");
        submit.click();
        clickPrimeMusic.click();
        selectGames.click();
        meetAlexa.click();
        amazonFresh.click();
        babyStore.click();
        amazonHome.click();
        shopWomen.click();
        amazonKindle.click();
        FireTV.click();
        books.click();
        Echo.click();
        shopMen.click();
        shopJewlery.click();
        handBags.click();
        homeDecore.click();
        artWork.click();
        textbooks.click();
        health.click();
        gift.click();
        beauty.click();
    }
}
