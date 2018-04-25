package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.By;

public class PrimePage extends CommonAPI {


    public void viewPrimePage() {
        driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[2]")).click();
    }

}
