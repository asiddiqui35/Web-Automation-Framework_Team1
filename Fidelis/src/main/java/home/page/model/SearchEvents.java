package home.page.model;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchEvents extends CommonAPI{
        @FindBy(xpath = "//input[@type='text' and @class='eventSearchBox']")
        public WebElement searchByzipeCode;
        @FindBy(css ="#dnn_ctr427_HtmlModule_lblContent > div")
        public WebElement eventGoBtn;
        @FindBy(xpath="//input[@name='dnn$ctr2146$View$zipCodeTxt']")
        public WebElement zipeCode;
        @FindBy(xpath="//input[ @id='dnn_ctr2146_View_distanceTxt'] ")
        public WebElement distance;
        @FindBy(name="Submit")
        public WebElement submitBtn;
        public void searchForevent(){
            searchByzipeCode.sendKeys("10001");
            eventGoBtn.click();
            distance.sendKeys("5");
            submitBtn.click();

        }
}

