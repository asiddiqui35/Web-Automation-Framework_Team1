package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {

    public void openHomePage() {
        driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[1]/span[1]")).click();
    }
}