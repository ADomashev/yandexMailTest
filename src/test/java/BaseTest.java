import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.WebDriverSingleton;

public class BaseTest {
    public WebDriver webDriver;

    @BeforeTest
    protected void setUp(){
    webDriver = WebDriverSingleton.WEB_DRIVER_INSTANCE.getInstance();
    }

    @AfterTest
    protected void tearDown(){
        webDriver.close();
    }
}
