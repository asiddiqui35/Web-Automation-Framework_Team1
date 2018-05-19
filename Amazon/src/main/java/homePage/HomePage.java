package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    public void viewHomePage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(5000);
    }
}
