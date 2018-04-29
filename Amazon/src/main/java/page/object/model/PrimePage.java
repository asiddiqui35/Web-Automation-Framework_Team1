package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class PrimePage extends CommonAPI{

    //@Test1

    public void viewPrimePage() {driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[2]")).click();}

    //@Test2
    public void selectTryPrime () {driver.findElement(By.xpath("//*[@id=\"prime-header-CTA\"]/span/input")).click();}

}
