package dataDriven;

import base.CommonAPI;
import database.ConnectDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JDBC extends CommonAPI {
    @FindBy(css = "#headerSearch")
    public WebElement searchBox;
    @FindBy(css=".headerSearch")
    public WebElement searchBtn;


    public WebElement getSearchBtn() {
        return searchBtn;
    }
    public void setSearchBtn(WebElement searchBtn) {
        this.searchBtn = searchBtn;
    }
    public WebElement getSearchBox() {
        return searchBox;
    }
    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }

    ConnectDB connectDB = new ConnectDB();
    public void readingfromsqlNsearching() throws Exception{
        List<String> topics = connectDB.readDataBase("searchInfo","topic");
        for(String text:topics){
       getSearchBox().sendKeys(text);
       getSearchBtn().click();

        }
        }


}
