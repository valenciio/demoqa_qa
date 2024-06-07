package pages3;

import com.codeborne.selenide.Condition;
import pages2.TestBase;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MVideoHomePage extends TestBase {
    public MVideoHomePage openHomePage() {
        open("https://www.mvideo.ru/");
        return this;
    }

    public MVideoHomePage clickCatalogButton() {
        $(".catalog-button .ng-star-inserted").
                shouldBe(Condition.visible).click();
        return this;
    }

    public MVideoHomePage clickAudioTechnicsLink() {
        $(byLinkText("Аудиотехника")).
                shouldHave(Condition.text("Аудиотехника")).click();
        return this;

    }
}