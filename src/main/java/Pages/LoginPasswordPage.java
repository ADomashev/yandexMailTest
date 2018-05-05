package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPasswordPage extends BasePage {
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/div/div/form/div[1]/label/input")
    WebElement loginInputField;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/div/div/form/div[2]/label/input")
    WebElement passwordInputField;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/div/div/form/div[4]/button[1]")
    WebElement enterButton;

    public LoginPasswordPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterLogin (String text){
        wait.elementIsPresent(webDriver,loginInputField);
        loginInputField.sendKeys(text);
    }

    public void enterPassword (String text){
        wait.elementIsPresent(webDriver,passwordInputField);
        passwordInputField.sendKeys(text);
    }
    public MailPage pressEnterButton(){
        enterButton.click();
        return new MailPage(webDriver);
    }
}
