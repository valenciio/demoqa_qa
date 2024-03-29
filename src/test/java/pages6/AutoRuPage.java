package pages6;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class AutoRuPage {
    public void openAutoRuPage() {
        open("https://auto.ru/");
    }

    public void goToDealers() {
        $(byLinkText("Дилеры")).shouldHave(Condition.text("Дилеры")).click();
    }

    public void selectDealer() {
        $(".DealerListItem__click").should(Condition.exist).click();
    }

    public void openDealerProfile() {
        $(".DealerProfileHeader__imageWrapper-pIGhi:nth-child(2)").should(Condition.visible).click();
    }

    public void openImageGallery() {
        $(".ImageGalleryFullscreenVertical__image").shouldBe(Condition.visible).click();
    }
}
