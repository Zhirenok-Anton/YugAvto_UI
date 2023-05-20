package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;

public class NewCarsPage {

    private ElementsCollection ListCartAuto= $$(".model__grid-card");

    @Step("Проверить количество карточке с авто")
    public NewCarsPage verifyCountCardAuto(){
        ListCartAuto.shouldHave(size(16));
        return this;
    }
}
