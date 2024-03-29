import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class Test2Test {
    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    public void test2() {

        open("https://www.mvideo.ru/");
        $(".catalog-button").shouldBe(Condition.visible);
        $(".catalog-button").should(Condition.exist);
        $(byTagName("body"));
        $(".catalog-button .ng-star-inserted").click();
        $(byLinkText("Аудиотехника")).click();
    }
}

