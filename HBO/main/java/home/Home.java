package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Home extends CommonAPI {
    public void homepage(){
        driver.findElement(By.className("")).sendKeys("Game of Thrones", Keys.ENTER);
    }
}
