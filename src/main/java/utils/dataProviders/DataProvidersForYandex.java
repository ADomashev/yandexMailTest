package utils.dataProviders;

import org.testng.annotations.DataProvider;
import utils.PropertyProvider;

public class DataProvidersForYandex {
    private static PropertyProvider propertyProvider =
            new PropertyProvider("C:/Users/Lenovo/IdeaProjects/yandexMailTest/src/main/resources/prop.properties");
    @DataProvider
    public static Object[][] loginPasswordDataProvider(){
        return new Object[][]{
                {propertyProvider.getProperty("notValidLogin"), propertyProvider.getProperty("notValidPassWord")},
                {propertyProvider.getProperty("validLogin"),propertyProvider.getProperty("notValidPassWord")},
                {propertyProvider.getProperty("notValidLogin"),propertyProvider.getProperty("validPassWord")},
                {propertyProvider.getProperty("validLogin"),propertyProvider.getProperty("validPassWord")}};
    }
}
