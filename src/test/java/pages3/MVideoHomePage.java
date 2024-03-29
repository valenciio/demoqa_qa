package pages3;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MVideoHomePage {
    public void openHomePage() {
        open("https://www.mvideo.ru/");
    }

    public void clickCatalogButton() {
        $(".catalog-button .ng-star-inserted").shouldBe(Condition.visible).click();
    }

    public void clickAudioTechnicsLink() {
        $(byLinkText("Аудиотехника")).shouldHave(Condition.text("Аудиотехника")).click();

    }
}