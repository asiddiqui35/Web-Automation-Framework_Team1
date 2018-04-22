package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;
public class CommonAPI {
    public WebDriver driver = null;
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("")String url) {
        System.setProperty("webdriver.chrome.driver", "../generic/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
