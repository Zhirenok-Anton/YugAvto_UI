package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;

public class UsedCarsPage {

    private ElementsCollection listCartAuto= $$(".model__grid-card");

    @Step("Проверить количество карточке с авто")
    public UsedCarsPage verifyCountCardAuto(){
        listCartAuto.shouldHave(size(16));
        return this;
    }
}
