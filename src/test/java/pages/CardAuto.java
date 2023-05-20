package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CardAuto {

    private SelenideElement
            nameAuto = $(".car__grid-item_title"),
            priceAuto = $(".price"),
            phone = $(".car__grid-box__status-phone");

    @Step("Проверить название авто")
    public CardAuto verifynameAuto(String name){
        nameAuto.shouldHave(text(name));
        return this;
    }

    @Step("Проверить цену авто")
    public CardAuto verifyPriceAuto(String price){
        priceAuto.shouldHave(text(price));
        return this;
    }
}
