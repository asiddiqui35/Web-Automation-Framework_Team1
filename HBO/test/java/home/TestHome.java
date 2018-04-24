package home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestHome extends Home{
    @Test
    public void testHome(){
        homepage();
        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[1]/input")).sendKeys("Game of Thrones", Keys.ENTER);;

    }
}
