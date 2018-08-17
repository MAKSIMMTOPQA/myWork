import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TakeAndPayBaseTest {


    WebDriver webDriver;
    TakeAndPayPage takeAndPayPage;

    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://www.satchelpay.com/en/take-and-pay/");
        takeAndPayPage = new TakeAndPayPage(webDriver);
    }


    @AfterMethod
    public void after() {
        webDriver.close();
    }
}
