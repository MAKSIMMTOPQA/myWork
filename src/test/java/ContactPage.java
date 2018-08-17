import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends TakeAndPayBasePage{





    @FindBy(xpath = "//div[@class='contactDetails-block']")
    private WebElement contactblock;


    public ContactPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }


    public boolean isContactPageLoaded (){
        return contactblock.isDisplayed();

    }
}
