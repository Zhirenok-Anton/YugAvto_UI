package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private SelenideElement
            newAutoButton= $(".cars-card-on-main[href='/cars/new/']"),
            usedAutoButton = $(".cars-card-on-main[href='/cars/used/']"),
            tradeAutoButton = $(".cars-card-on-main[href='/services/trade-in/']"),
            servicesAutoButton = $(".cars-card-on-main[href='/services/service/']");

    @Step("Открыть страницу https://yug-avto.ru/")
    public MainPage openPage(){
        open("/");
        return this;
    }

    @Step("Нажать кнопку Новые авто")
    public MainPage clickNewAutoButton(){
        newAutoButton.click();
        return this;
    }

    @Step("Нажать кнопку Авто с пробегом")
    public MainPage clickUsedAutoButton(){
        usedAutoButton.click();
        return this;
    }

    @Step("Нажать кнопку Продать Авто")
    public MainPage clickTradeAutoButton(){
        tradeAutoButton.click();
        return this;
    }

    @Step("Нажать кнопку Записаться на сервис")
    public MainPage clickServicesAutoButton(){
        servicesAutoButton.click();
        return this;
    }
}
