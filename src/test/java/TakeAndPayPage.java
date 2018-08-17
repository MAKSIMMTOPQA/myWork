import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeAndPayPage extends  TakeAndPayBasePage {


    @FindBy(xpath = "//div[@class='icon']")
    private WebElement callback;
    @FindBy(xpath = "//a[contains(text(),'LEARN MORE')]")
    private WebElement learnmore;
    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitbutton;
    @FindBy (xpath = "//a[contains(text(),'GET IN TOUCH')]")
    private WebElement getintouch;
    @FindBy(xpath = "//a[contains(text(),'Accept & Close')]")
    private WebElement cookie;



    public TakeAndPayPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }

    public boolean CookiePolicyLoaded(){
       return cookie.isDisplayed();
    }

    public void ClosePolicy(){
        cookie.click();
    }



    public void ClickCallBack() {
        callback.click();
    }

    public boolean isPageLoaded() {
        return submitbutton.isDisplayed();

    }

    public void ClickLearnMore(){
        learnmore.click();
    }


    public ContactPage getContactPage(){
//        Actions actions = new Actions(webDriver);
//        actions.moveToElement(getintouch).click().perform();
        getintouch.click();
        return new ContactPage(webDriver);

    }





}

