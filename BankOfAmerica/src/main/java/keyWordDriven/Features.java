package keyWordDriven;

import base.CommonAPI;
import home.HomePage;
import home.LogIn;
import home.Search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import java.io.IOException;
import java.io.InvalidClassException;

public class Features extends CommonAPI {
    public void languageAndLocation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage =PageFactory.initElements(driver,HomePage.class);
        homePage.checkLanguage();
        driver.navigate().back();
        homePage.locationDropdown();
    }

    public void signIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LogIn logIn = PageFactory.initElements(driver,LogIn.class);
        logIn.enterUserName();
        logIn.enterPassword();
        logIn.clickSignIn();
        goBackToHomeWindow();
    }

    public void search() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search searchBox = PageFactory.initElements(driver,Search.class);
        searchBox.searchInSearchBox();
    }

    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        switch (featureName) {
            case "languageAndLocation":
                languageAndLocation();
                break;
            case "search":
                search();
                break;
            case "signIn":
               // signIn();
                break;
            default:
                throw new InvalidClassException("Not a Feature in this this list");
        }
    }
    public void selectFeatures(WebDriver driver1) throws IOException, InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
        ExcelFile excelReader = new ExcelFile();
        String[] testSteps = excelReader.getDataFromExcelFileForFeaturesChoice();
        for (int i = 0; i < testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
