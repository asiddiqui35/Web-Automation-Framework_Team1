package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrimePage extends CommonAPI{

    public void viewPrimePage() {driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[2]")).click();}

    public void selectTryPrime () {driver.findElement(By.xpath("//*[@id=\"prime-header-CTA\"]/span/input")).click();}

}
