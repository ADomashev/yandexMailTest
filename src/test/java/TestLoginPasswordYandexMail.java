import org.testng.annotations.Test;
import utils.PropertyProvider;


public class TestLoginPasswordYandexMail extends BaseTest {

    @Test
    public void testLoginPassword(){

        webDriver.get("https://yandex.by/");
        PropertyProvider propertyProvider = new PropertyProvider("C:/Users/Lenovo/IdeaProjects/yandexMailTest/src/main/resources/prop.properties");
        System.out.println(propertyProvider.getProperty("login"));
        System.out.println(propertyProvider.getProperty("pass"));
    }

}
