package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalmartHelp extends CommonAPI{


    @FindBy(xpath = "//*[@id=\"header-GlobalEyebrowNav-link-7\"]")
    WebElement help;


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

    public void help() throws InterruptedException {

        help.click();

        gift.click();

        wedding.click();

        dinning.click();

        selectPlates.click();

        plate.click();

    }
}
