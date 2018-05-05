import Pages.HomePage;
import Pages.LoginPasswordPage;
import org.testng.annotations.Test;


public class TestSendMail extends BaseTest {

    @Test(suiteName = "second")
    public void testLoginPassword(){

       // webDriver.get("https://yandex.by/");
       // PropertyProvider propertyProvider = new PropertyProvider("C:/Users/Lenovo/IdeaProjects/yandexMailTest/src/main/resources/prop.properties");

        HomePage homePage = new HomePage(webDriver);
        LoginPasswordPage loginPasswordPage = homePage.pressButtomEnter();
        loginPasswordPage.enterLogin(propertyProvider.getProperty("loginSend"));
        loginPasswordPage.enterPassword(propertyProvider.getProperty("passwordSend"));


    }

}
