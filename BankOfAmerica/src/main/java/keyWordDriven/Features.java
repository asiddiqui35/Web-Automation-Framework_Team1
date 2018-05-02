package keyWordDriven;

import base.CommonAPI;
import home.HomePage;
import home.LogIn;
import home.Search;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.InvalidClassException;

public class Features extends CommonAPI {
    LogIn logIn = new LogIn();
    HomePage homePage =new HomePage();
    Search searchBox = new Search();
    public void languageAndLocation(){
        homePage.checkHomePage();
        homePage.checkLanguage();
        homePage.locationDropdown();
    }
    public void signIn(){
      logIn.enterUserName();
      logIn.enterPassword();
      logIn.clickSignIn();
    }
    public void search(){
        searchBox.searchInSearchBox();
    }
    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException{
        switch (featureName){
            case "languageAndLocation":
                signIn();
                break;
            case "search":
                search();
                break;
            case"signIn":
                signIn();
                default:
                    throw new InvalidClassException("Not a Feature in this this list");
        }
    }
    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        ExcelFile excelReader = new ExcelFile();
        String [] testSteps = excelReader.getDataFromExcelFileForFeaturesChoice();
        for (int i = 0; i < testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
