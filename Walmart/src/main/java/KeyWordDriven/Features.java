package KeyWordDriven;

import base.CommonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reporting.TestLogger;
import java.io.IOException;
import java.io.InvalidClassException;
public class Features extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"header-GlobalEyebrowNav-link-7\"]")
    public WebElement help;

    @FindBy(xpath = "//*[@id=\"rn_PageContent\"]/div[1]/div[9]/a/div[2]")
    WebElement gift;

    @FindBy(xpath = "//*[@id=\"categoryAppCenterContent\"]/div[1]/span/div[1]/span/div/div/div/map/area[1]")
    WebElement wedding;

    @FindBy(xpath = "//*[@id=\"carousel-d632deab-58bb-4bf8-a8c9-55123933ee4b\"]/div[2]/div[1]/ul/li[4]/div/div/a")
    WebElement dinning;

    @FindBy(xpath = "//*[@id=\"carousel-8938ac16-1f33-4a41-bc3d-2559edc63ad4\"]/div[2]/div[1]/ul/li[3]/div/div/a")
    WebElement selectPlates;
    @FindBy(xpath = "//*[@id=\"searchProductResult\"]/ul/li[1]/div/div/div[4]/div/span[2]/a/span")
    WebElement plate;
        @FindBy(xpath = "")
        WebElement popUpCloseBtn;
        public void shoppingCart() {
            WebDriverWait wait = new WebDriverWait(driver, 35);
            wait.until(ExpectedConditions.elementToBeClickable(popUpCloseBtn));
            popUpCloseBtn.click();
        }
                public void help() throws InterruptedException {

                    help.click();

                    gift.click();

                    wedding.click();

                    dinning.click();

                    selectPlates.click();

                    plate.click();
        }
    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        switch (featureName) {
            case "shoppingCart":
                shoppingCart();
                break;
            case "search":
                //search();
                break;
            case "signIn":
               // signIn();
            default:
                throw new InvalidClassException("Not a Feature in this this list");
        }
    }
    public void selectFeatures(WebDriver driver1) throws IOException, InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
        ExcelFile excelReader = new ExcelFile();
        String[] testSteps = excelReader.getDataFromExcelFileForFeaturesChoice();
        for (int i = 1; i < testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
