import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class Test1Test {
    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    public void test1() {

        open("https://formdesigner.ru/");
        $(".form-template:nth-child(3) > .form-template__name").click();
        switchTo().frame(0);
        $(byName("field1[2]")).click();
        $(byName("field1[2]")).val("selezenev");
        $(byName("field1[1]")).click();
        $(byName("field1[1]")).val("valentin");
        $(byName("field1[3]")).click();
        $(byName("field1[3]")).val("ivanovich");
        $("#field2").click();
        $("#field2").val("selezenev23@mail.ru");
        $("#field3").click();
        $("#field3").val("12345678911");
        $("#field4").click();
        $("#field4").selectOption("Товар №2");
        $("#field5").click();
        $("#field5").val("3");
        $("#field6").click();
        $("#field6").val("23");
        $(byName("submit")).click();
    }
}