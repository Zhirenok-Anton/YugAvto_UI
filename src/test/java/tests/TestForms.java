package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("Forms")
public class TestForms extends TestBase {

    MainPage mainPage = new MainPage();
    TradeInPage tradeInPage = new TradeInPage();
    ServicesAutoPage servicesAutoPage = new ServicesAutoPage();
    TestData testData = new TestData();

    @Test
    @Tag("avto")
    public void test3(){
        mainPage.openPage();
        mainPage.clickTradeAutoButton();
        tradeInPage.setName(testData.firstName);
        tradeInPage.setPhone(testData.phoneNumber);
        tradeInPage.setAgree();
        tradeInPage.clickRateCar();
        tradeInPage.verifySuccessApplication("Спасибо за вашу заявку!\n" +
                                                    "Мы свяжемся с Вами в ближайшее время.");
    }

    @Test
    @Tag("avto")
    public void test4(){
        mainPage.openPage();
        mainPage.clickServicesAutoButton();
        servicesAutoPage.setName(testData.firstName);
        servicesAutoPage.setPhone(testData.phoneNumber);
        servicesAutoPage.setDealership();
        servicesAutoPage.setComment("Это мой вопрос?");
        servicesAutoPage.setAgree();
        servicesAutoPage.clickSendForm();
        servicesAutoPage.verifySuccessApplication("Спасибо за вашу заявку!\n" +
                                                        "Мы свяжемся с Вами в ближайшее время.");
    }
}
