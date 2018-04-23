package home.page;

import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePageFB extends CommonAPI{
    public String checkBrowser() {
        String title = driver.getTitle();
        return title;
    }
    public void checkSignIn(){
        driver.findElement(By.xpath("//input[@class='inputtext' and @name='email']")).click();
        }
}
