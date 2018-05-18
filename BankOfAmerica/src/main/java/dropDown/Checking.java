package dropDown;

import base.CommonAPI;
import org.apache.poi.ss.formula.functions.WeekNum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checking extends CommonAPI {
    @FindBy(xpath = "//span[text()='Checking'][1]") public WebElement chekingMenu;
    @FindBy(id = "coreChecking")public WebElement coreCheking;
    @FindBy(id="interestChecking")public WebElement interestChecking;
    @FindBy(id="studentBanking")public WebElement studenBanking;
    @FindBy(id = "businessChecking")public WebElement busunessChecking;
    @FindBy(id = "navCheckingOnlineBanking")public WebElement checkingOnlineBanking;
    @FindBy(id = "navCheckingMobileBanking")public WebElement chekingMobileBanking;
    public WebElement getChekingMenu() {
        return chekingMenu;
    }
    public void setChekingMenu(WebElement chekingMenu) {
        this.chekingMenu = chekingMenu;
    }
    public void seletCheking(){
        getChekingMenu().click();
    }
    public void selectCoreChecking(){
        seletCheking();
        coreCheking.click();
    }
    public void selectInterestCheking(){
        seletCheking();
        interestChecking.click();
    }
    public void selectStudentBanking(){
        seletCheking();
        studenBanking.click();
    }
    public void selectBusinessCheking(){
        seletCheking();
        busunessChecking.click();
    }
    public void selectCheckingOnlineBanking(){
        seletCheking();
        checkingOnlineBanking.click();
    }
    public void selectChekingMobileBanking(){
        seletCheking();
        chekingMobileBanking.click();
    }
}
