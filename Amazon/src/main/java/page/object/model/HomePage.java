package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends CommonAPI {


    public void viewHomePage() {
        driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[2]")).click();

    }

}
