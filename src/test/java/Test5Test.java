import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class Test5Test {
    @BeforeEach
    public void setUp() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    public void test5() {

        open("https://auto.ru/");
        $(byLinkText("Дилеры")).click();
        $(".DealerListItem__click").click();
        $(".DealerProfileHeader__imageWrapper-pIGhi:nth-child(2)").click();
        $(".ImageGalleryFullscreenVertical__image").click();
    }
}