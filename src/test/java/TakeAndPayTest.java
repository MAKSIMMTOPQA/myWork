import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TakeAndPayTest extends TakeAndPayBaseTest {

    @Test
    public  void TakeAndPaySuccesstest() throws InterruptedException {


        TakeAndPayPage takeAndPayPage = new TakeAndPayPage(webDriver);


        if (takeAndPayPage.CookiePolicyLoaded())
            takeAndPayPage.ClosePolicy();



        takeAndPayPage.ClickCallBack();
        sleep(1000);
        Assert.assertEquals(takeAndPayPage.getCurrentUrl(),
                "https://www.satchelpay.com/en/take-and-pay/",
                "Page not loaded");
        Assert.assertTrue(takeAndPayPage.isPageLoaded(),"Page is loaded");

        takeAndPayPage.ClickLearnMore();
        sleep(1000);
        Assert.assertEquals(takeAndPayPage.getCurrentUrl(),
                "https://www.satchelpay.com/en/take-and-pay/",
                "page not loaded");
        sleep(3000);
        ContactPage contactPage = takeAndPayPage.getContactPage();
        sleep(3000);
        Assert.assertEquals(contactPage.getCurrentUrl(),
                "https://www.satchelpay.com/en/contacts/",
                "Page not loaded");

        Assert.assertTrue(contactPage.isContactPageLoaded(),"Page is loaded");

        webDriver.navigate().back();

        Assert.assertEquals(contactPage.getCurrentUrl(),
                "https://www.satchelpay.com/en/take-and-pay/",
                "Page not loaded");



    }
}
