import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class Test4Test {
    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    public void test4() {

        open("https://formdesigner.ru/");
        switchTo().frame(0);
        $("#field25").click();
        $("#field25").val("valentin");
        $("#field26").click();
        $("#field26").val("selezenev@mail.ru");
        $("#field27").click();
        $("#field27").val("test");
        $("#field28").click();
        $("#field28").val("hello world");
        $(byName("submit")).click();
    }
}