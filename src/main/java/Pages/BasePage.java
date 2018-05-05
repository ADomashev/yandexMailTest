package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.waiters.Wait;

public class BasePage {
    protected WebDriver webDriver;
    protected Wait wait = new Wait();
    public BasePage(WebDriver webDriver ) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    protected void click(WebElement webElement){
        webElement.click();
    }
}
