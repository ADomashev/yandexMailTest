package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

//    @FindBy(xpath = "//a[@class='button desk-notif-card__login-enter-expanded button_theme_bordergray button_size_m i-bem button_js_inited']")
    @FindBy(xpath ="/html/body/div[1]/div[3]/div[1]/div/div[1]/div/a" )
    private WebElement mailButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPasswordPage pressButtomEnter(){
        wait.elementIsPresent(webDriver,mailButton);
        super.click(mailButton);
        return new LoginPasswordPage(webDriver);
    }
}
