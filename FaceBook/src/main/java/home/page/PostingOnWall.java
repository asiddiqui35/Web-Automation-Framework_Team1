package home.page;

import base.CommonAPI;
import org.openqa.selenium.By;

public class PostingOnWall extends CommonAPI {

    public void postStatus(){
        driver.findElement(By.xpath("//*[@id=\"js_2k\"]/div[1]/div/div[1]/div[2]/div/div/div")).sendKeys("Hello Everyone");
        driver.findElement(By.cssSelector("#js_2k > div._1j2v > div._2dck._4-u3._57d8 > div > div._ohf.rfloat > div > span._3_xb > button")).click();

    }
}
