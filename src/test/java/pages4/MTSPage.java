package pages4;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MTSPage {

    public void openMTSPage() {
        open("https://spb.mts.ru/personal");
    }

    public void clickFirstCard() {
        $(".navigations__card:nth-child(1) > .card__left-content").
                shouldBe(visible).click();
    }

    public void clickSecondCard() {
        $(".category-card:nth-child(2) > .category-card__wrap").
                shouldBe(visible).click();
    }

    public void clickUniversalCardButton() {
        $("#\\35 450145 a .universal-card-button__text").
                shouldBe(visible).click();
    }

    public void clickConnectButton() {
        $(".connect-top-button .btn").
                shouldBe(visible).click();
    }

    public void clickFirstConnectMethod() {
        $(".connect-methods__list-item:nth-child(1) .connect-method__title").
                shouldBe(visible).click();
        $(byText("Перейдите в МТС со своим номером"));
    }
}
