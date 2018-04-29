package home;

import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
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
