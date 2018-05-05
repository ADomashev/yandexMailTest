import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.PropertyProvider;
import utils.WebDriverSingleton;

public class BaseTest {
    protected WebDriver webDriver;
    protected PropertyProvider propertyProvider;

    @BeforeTest
    protected void setUp(){
    webDriver = WebDriverSingleton.WEB_DRIVER_INSTANCE.getInstance();
    propertyProvider = new PropertyProvider("C:/Users/Lenovo/IdeaProjects/yandexMailTest/src/main/resources/prop.properties");
    webDriver.get("https://yandex.by/");
    }

    @AfterTest
    protected void tearDown(){
        webDriver.close();
    }
}
