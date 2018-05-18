package keyWordDriven;

import base.CommonAPI;
import home.page.model.HomePage;
import home.page.model.SearchEvents;
import home.page.model.SigningUp;
import org.apache.commons.codec.language.bm.Languages;
import org.openqa.selenium.WebDriver;
import reporting.TestLogger;

import java.io.IOException;
import java.io.InvalidClassException;

public class Feature extends CommonAPI {
    public void language() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new HomePage();
            homePage.checkLanguage();
    }

    public void searchNevents() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchEvents searchNevents = new SearchEvents();
        searchNevents.searchForevent();

    }

    public void SigningUp() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SigningUp signingUp = new SigningUp();
        signingUp.clickOnLogin();
    }

    public void select(String featureName, WebDriver driver1) throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        switch (featureName) {
            case "language":
                language();
                break;
            case "searchNevents":
                searchNevents();
                break;
            case "SigningUp":
                SigningUp();

            default:
                throw new InvalidClassException("Not a Feature in this this list");
        }
    }

    public void featuresCall(WebDriver driver) throws Exception, InterruptedException {
        ExcelFile excelReader = new ExcelFile();
        String[] testSteps = excelReader.getDataFromExcelFileForFeaturesChoice();
        for (int i = 1; i < testSteps.length; i++) {
            select(testSteps[i], driver);
        }
    }
}
