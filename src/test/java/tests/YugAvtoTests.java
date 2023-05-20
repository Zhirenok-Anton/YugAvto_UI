package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

public class YugAvtoTests extends TestBase{

    MainPage mainPage = new MainPage();
    NewCarsPage newCarsPage = new NewCarsPage();
    CardAuto cardAuto = new CardAuto();
    UsedCarsPage usedCarsPage = new UsedCarsPage();
    TradeInPage tradeInPage = new TradeInPage();
    ServicesAutoPage servicesAutoPage = new ServicesAutoPage();


    @Test
    @Tag("avto")
    public void test(){
        mainPage.openPage();
        mainPage.clickNewAutoButton();
        newCarsPage.verifyCountCardAuto();
    }

    @Test
    @Tag("avto")
    public void test2(){
        mainPage.openPage();
        mainPage.clickUsedAutoButton();
        usedCarsPage.verifyCountCardAuto();
    }

    @Test
    @Tag("avto")
    public void test3(){
        mainPage.openPage();
        mainPage.clickTradeAutoButton();
        tradeInPage.setName("Test");
        tradeInPage.setPhone("1234567890");
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
        servicesAutoPage.setName("Test");
        servicesAutoPage.setPhone("11234567890");
        servicesAutoPage.setDealership();
        servicesAutoPage.setComment("Это мой вопрос?");
        servicesAutoPage.setAgree();
        servicesAutoPage.clickSendForm();
        servicesAutoPage.verifySuccessApplication("Спасибо за вашу заявку!\n" +
                                                        "Мы свяжемся с Вами в ближайшее время.");
    }
}