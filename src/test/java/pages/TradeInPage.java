package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TradeInPage {

    private SelenideElement
            nameInput = $("#NAME_14"),
            phoneInput = $("#PHONE_14"),
            agreeCheckbox = $("#AGRYY_14"),
            rateCarButton = $(".justify-content-center[role='sendForm']"),
            successApplication = $(".mb-3[role='success'] > div");

    @Step("Ввести имя")
    public TradeInPage setName(String name){
        nameInput.setValue(name);
        return this;
    }

    @Step("Ввести телефон")
    public TradeInPage setPhone(String phone){
        phoneInput.setValue(phone);
        return this;
    }

    @Step("Установить Checkbox")
    public TradeInPage setAgree(){
        agreeCheckbox.click();
        return this;
    }

    @Step("Нажать кнопку Оценить Авто")
    public TradeInPage clickRateCar(){
        rateCarButton.click();
        return this;
    }

    @Step("Проверить сообщение об успешной отправки")
    public TradeInPage verifySuccessApplication(String successMessage){
        successApplication.shouldHave(text(successMessage));
        return this;
    }
}
