package utils.waiters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
    WebDriver webDriver;

    public void elementIsPresent(WebDriver webDriver, WebElement webElement){
        new WebDriverWait(webDriver,15).until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
