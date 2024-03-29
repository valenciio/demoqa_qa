import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;

public class Test3Test {
    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    public void test3() {

        open("https://spb.mts.ru/personal");
        $(".navigations__card:nth-child(1) > .card__left-content").click();
        $(".category-card:nth-child(2) > .category-card__wrap").click();
        $("#\\35 450145 a .universal-card-button__text").click();
        $(".connect-top-button .btn").click();
        //executeJavaScript("window.scrollTo(0,0)");
        $(".connect-methods__list-item:nth-child(1) .connect-method__title").click();
    }
}