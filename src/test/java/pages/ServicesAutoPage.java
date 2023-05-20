package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ServicesAutoPage {

    private SelenideElement
            nameInput = $("#NAME_7"),
            phoneInput = $("#PHONE_7"),
            dealershipInput = $(".form-group input[name='DEALERSHIP']"),
            commentInput = $("#COMMENT_7"),
            sendFormButton = $(".mb-lg-0 .d-block"),
            agreeCheckbox = $("#AGRYY_7"),
            successApplication = $(".mb-3[role='success'] .text-center");

    private ElementsCollection ListDealership = $$(".form-group .multiselect__option");

    @Step("Ввести имя")
    public ServicesAutoPage setName(String name){
        nameInput.setValue(name);
        return this;
    }

    @Step("Ввести телефон")
    public ServicesAutoPage setPhone(String phone){
        phoneInput.setValue(phone);
        return this;
    }

    @Step("Выбрать Автосалон")
    public ServicesAutoPage setDealership(){
        dealershipInput.parent().click();
        ListDealership.get(1).click();
        return this;
    }

    @Step("Ввести комментарий")
    public ServicesAutoPage setComment(String comment){
        commentInput.setValue(comment);
        return this;
    }

    @Step("Установить Checkbox")
    public ServicesAutoPage setAgree(){
        agreeCheckbox.click();
        return this;
    }

    @Step("Нажать кнопку отправить")
    public ServicesAutoPage clickSendForm(){
        sendFormButton.click();
        return this;
    }

    @Step("Проверить сообщение об успешной отправки")
    public ServicesAutoPage verifySuccessApplication(String successMessage){
        successApplication.shouldHave(text(successMessage));
        return this;
    }
}