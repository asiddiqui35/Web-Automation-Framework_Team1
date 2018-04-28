package home.page;

import base.CommonAPI;

import org.apache.bcel.generic.Select;
import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.naming.Name;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Registration extends CommonAPI {

    public void signUp() throws InterruptedException {

        driver.findElement(By.name("firstname")).sendKeys("maya");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.name("lastname")).sendKeys("Begum");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.name("reg_passwd__")).sendKeys("abc123");

        driver.findElement(By.xpath("//*[@id='month']")).click();
        driver.findElement(By.xpath("//*[@id='month']/option[4]")).click();

        driver.findElement(By.xpath("//*[@id=\"day\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"day\"]/option[3]")).click();

        driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"year\"]/option[30]")).click();

//        driver.findElement(By.xpath("//*[@id=\"u_0_12\"]/span[1]/label")).click();
//        driver.findElement(By.xpath("//*[@id=\"u_0_12\"]/span[2]/label")).click();

        driver.findElement(By.name("websubmit")).click();

        driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();


        //WebElement element=driver.findElement(By.id("month"));
        /*Actions ac = new Actions(driver);
        ac.moveToElement(element).click();
        waitUntilVisible(By.id("month"));
*/
    }
}



//      driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("Nisha");
//        driver.findElement(By.name("lastname")).sendKeys("Karim");
//        driver.findElement(By.cssSelector("#u_0_j")).sendKeys("whatever@yahoo.c");
//        driver.findElement(By.cssSelector("#u_0_m")).sendKeys("night@yahoo.com");
//        driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
//        driver.findElement(By.cssSelector("#month")).click();
//        driver.findElement(By.xpath("//*[@id='month']/option[1]")).click();
//        driver.findElement(By.id("id=day")).click();
//        driver.findElement(By.xpath("//*[@id='day']/option[1]")).click();
//        driver.findElement(By.id("id=year")).click();
//        driver.findElement(By.xpath("//*[@id='year']/option[1]")).click();
























