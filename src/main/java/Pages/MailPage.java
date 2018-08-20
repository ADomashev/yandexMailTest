package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailPage extends BasePage {
//    @FindBy(xpath ="/html/body/div[2]/div[4]/div/div[2]/div[3]/div[7]/div")
    @FindBy(xpath = "//div[@class='mail-User-Name']")
    WebElement nameMailBox;

    public MailPage(WebDriver webDriver) {
        super(webDriver);
    }
    public String isPresent(){
        wait.elementVisibleFull(webDriver,nameMailBox);
        System.out.println(nameMailBox.getText()+" get textttt");

        String result = nameMailBox.getText();

        return result;
    }
}
