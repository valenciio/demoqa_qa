package pages4;

import page.TestBase;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MTSPage extends TestBase {

    public MTSPage openMTSPage() {
        open("https://spb.mts.ru/personal");
        return this;
    }

    public MTSPage clickFirstCard() {
        $(".navigations__card:nth-child(1) > .card__left-content").
                shouldBe(visible).click();
        return this;
    }

    public MTSPage clickSecondCard() {
        $(".category-card:nth-child(2) > .category-card__wrap").
                shouldBe(visible).click();
        return this;
    }

    public MTSPage clickUniversalCardButton() {
        $("#\\35 450145 a .universal-card-button__text").
                shouldBe(visible).click();
        return this;
    }

    public MTSPage clickConnectButton() {
        $(".connect-top-button .btn").
                shouldBe(visible).click();
        return this;
    }

    public MTSPage clickFirstConnectMethod() {
        $(".connect-methods__list-item:nth-child(1) .connect-method__title").
                shouldBe(visible).click();
        $(byText("Перейдите в МТС со своим номером"));
        return this;
    }
}
