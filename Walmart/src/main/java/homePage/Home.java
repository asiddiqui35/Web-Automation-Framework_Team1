package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;

public class Home extends CommonAPI {
    public void HomePage(){
        driver.findElement(By.xpath("//*[@id=\"header-Logo\"]")).click();
    }

}
