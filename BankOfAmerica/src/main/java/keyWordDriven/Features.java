package keyWordDriven;

import base.CommonAPI;
import home.HomePage;
import home.LogIn;
import home.Search;
import org.openqa.selenium.WebDriver;
import reporting.TestLogger;

import java.io.IOException;
import java.io.InvalidClassException;

public class Features extends CommonAPI {
    public void languageAndLocation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new HomePage();
        homePage.checkHomePage();
        homePage.checkLanguage();
        homePage.locationDropdown();
    }

    public void signIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LogIn logIn = new LogIn();
        logIn.enterUserName();
        logIn.enterPassword();
        logIn.clickSignIn();
    }

    public void search() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search searchBox = new Search();
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
                signIn();
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
