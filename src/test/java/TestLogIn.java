import Pages.HomePage;
import Pages.LoginPasswordPage;
import Pages.MailPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.dataProviders.DataProvidersForYandex;

import static org.testng.Assert.assertEquals;

public class TestLogIn extends BaseTest {
    @Test(  suiteName = "first",
            dataProvider = "loginPasswordDataProvider",
            dataProviderClass = DataProvidersForYandex.class)
    public void testLogin(String expectedResult,String login, String passWord){
        HomePage homePage = new HomePage(webDriver);
        LoginPasswordPage loginPasswordPage = homePage.pressButtomEnter();
        loginPasswordPage.enterLogin(login);
        loginPasswordPage.enterPassword(passWord);
        MailPage mailPage = loginPasswordPage.pressEnterButton();
        assertEquals(expectedResult,mailPage.isPresent());


    }

//    @DataProvider
//    public Object[][] loginPasswordDataProvider(){
//        return new Object[][]{
////                {propertyProvider.getProperty("notValidLogin"), propertyProvider.getProperty("notValidPassWord")},
////                {propertyProvider.getProperty("validLogin"),propertyProvider.getProperty("notValidPassWord")},
////                {propertyProvider.getProperty("notValidLogin"),propertyProvider.getProperty("validPassWord")},
//                {propertyProvider.getProperty("validLogin"),propertyProvider.getProperty("validPassWord")}};
//    }
}
