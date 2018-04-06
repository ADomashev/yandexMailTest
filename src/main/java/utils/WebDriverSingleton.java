package utils;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public enum  WebDriverSingleton {

    WEB_DRIVER_INSTANCE;

    private  WebDriver webDriver;

    public WebDriver getInstance(){
        if (webDriver==null){
            System.setProperty("webdriver.gecko.driver", "C:/MyFiles/Programming/downloaded files/geckodriver-v0.20.0-win32/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
            webDriver = new FirefoxDriver(options);
            return webDriver;
        }
        return webDriver;
    }
}
