package home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestHome extends Home{
    @Test //test1
    public void testHome(){
        clickSearch();
        putNames();
    }
    @Test //test3
    public void testHomeTab(){
        chekHomeTabElements();
    }
//    @Test //test4
//    public void testPlayTrailer() {
//        playTrailer();
//
//    }
}
