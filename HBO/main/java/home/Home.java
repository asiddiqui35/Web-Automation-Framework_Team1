package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Home extends CommonAPI {
    public void clickSearch(){
        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")).click();
    }
    public void putNames(){
    driver.findElement(By.xpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[1]/input")).sendKeys("Game of Thrones", Keys.ENTER);
    }
    public void chekHomeTabElements(){
        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[1]/div/a")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[2]/div/a")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[contains(text(),'Boxing')][1]")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[contains(text(),'Boxing')][1]")).click();
        driver.navigate().back();
        System.out.println(getCurrentPageUrl());
    }
    public void playTrailer(){
        driver.findElement(By.xpath("/html/body/main/div[5]/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[1]")).click();
        driver.switchTo();
    }
}

