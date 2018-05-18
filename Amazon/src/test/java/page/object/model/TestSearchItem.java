//package page.object.model;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import page.object.model.search.SearchItems;
//import reporting.TestLogger;
//
//import java.io.IOException;
//
//public class TestSearchItem extends SearchItems {
//
//    public void searchItemsAndSubmitButton() throws IOException {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        SearchItems itemsToBeSearched = new SearchItems();
//        String[] value = itemsToBeSearched.getDataFromExcelFile();
//        for (int i = 0; i < value.length; i++) {

//            searchFor(value[i]);

//            searchfor(value[i]);

//            submitSearchButton();
//            clearInput();
//        }
//    }
//}
