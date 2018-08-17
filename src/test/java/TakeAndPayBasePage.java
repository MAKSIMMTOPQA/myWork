import org.openqa.selenium.WebDriver;

public class TakeAndPayBasePage {

    protected WebDriver webDriver;

    public TakeAndPayBasePage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getCurrentUrl (){
        return webDriver.getCurrentUrl();
    }

//    public String getCurrentTittle (){
//        return webDriver.getTitle();
//    }
}
