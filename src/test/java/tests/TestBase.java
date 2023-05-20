package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import attach.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class TestBase {

    /* @BeforeAll
     public static void beforeAll() {

         Configuration.baseUrl = "https://demoqa.com";
         Configuration.browser = "Chrome";
         Configuration.browserVersion = "100.0";
         Configuration.browserSize = "1920x1080";
         Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

         DesiredCapabilities capabilities = new DesiredCapabilities();
         capabilities.setCapability("browserName", "chrome");
         capabilities.setCapability("browserVersion", "100.0");
         capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                 "enableVNC", true,
                 "enableVideo", true
         ));

         Configuration.browserCapabilities = capabilities;

     }*/
    @BeforeAll
    public static void beforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        Configuration.remote = "https://user1:1234@" + System.getProperty("selenoid_url", "selenoid.autotests.cloud/wd/hub");


        Configuration.baseUrl = System.getProperty("baseurl", "https://yug-avto.ru" );


        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browser_version", "100.0");
        Configuration.browserSize = System.getProperty("browser_size", "1920x1440");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }


    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }


    @AfterEach
    void addAttachments(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
