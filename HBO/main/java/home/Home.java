package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Home extends CommonAPI {
    public void homepage(){
        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")).click();

    }
}
