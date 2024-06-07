package pages6;

import com.codeborne.selenide.Condition;
import page.TestBase;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class AutoRuPage extends TestBase {
    public AutoRuPage openAutoRuPage() {
        open("https://auto.ru/");
        return this;
    }

    public AutoRuPage goToDealers() {
        $(byLinkText("Дилеры")).
                shouldHave(Condition.text("Дилеры")).click();
        return this;
    }

    public AutoRuPage selectDealer() {
        $(".DealerListItem__click").
                should(Condition.exist).click();
        return this;
    }

    public AutoRuPage openDealerProfile() {
        $(".DealerProfileHeader__imageWrapper-pIGhi:nth-child(2)").
                should(Condition.visible).click();
        return this;
    }

    public AutoRuPage openImageGallery() {
        $(".ImageGalleryFullscreenVertical__image").
                shouldBe(Condition.visible).click();
        return this;
    }
}
