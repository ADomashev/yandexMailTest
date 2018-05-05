import Pages.HomePage;
import Pages.LoginPasswordPage;
import org.testng.annotations.Test;
import utils.dataProviders.DataProvidersForYandex;

public class TestLogIn extends BaseTest {
    @Test(  suiteName = "first",
            dataProvider = "loginPasswordDataProvider",
            dataProviderClass = DataProvidersForYandex.class)
    public void testLogin(String login, String passWord){
        HomePage homePage = new HomePage(webDriver);
        LoginPasswordPage loginPasswordPage = homePage.pressButtomEnter();
        loginPasswordPage.enterLogin(login);
        loginPasswordPage.enterPassword(passWord);

    }

//    @DataProviders
//    public Object[][] loginPasswordDataProvider(){
//        return new Object[][]{
//                {propertyProvider.getProperty("notValidLogin"), propertyProvider.getProperty("notValidPassWord")},
//                {propertyProvider.getProperty("validLogin"),propertyProvider.getProperty("notValidPassWord")},
//                {propertyProvider.getProperty("notValidLogin"),propertyProvider.getProperty("validPassWord")},
//                {propertyProvider.getProperty("validLogin"),propertyProvider.getProperty("validPassWord")}};
//    }
}
