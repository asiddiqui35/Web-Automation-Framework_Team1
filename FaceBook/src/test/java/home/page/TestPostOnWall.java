package home.page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPostOnWall extends PostingOnWall {
    @Test
    public void postInWall() throws InterruptedException {
        PostingOnWall postonwall = PageFactory.initElements(driver,PostingOnWall.class);
        logIn();
        clickOnHome();
        cliOnMakePost();
        postonwall.postOnWall();
    }
}
