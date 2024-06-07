package pages2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class Test1Test extends TestBase {


    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void test1() {
        open("https://formdesigner.ru/");
        formDesignerPage
                .formTemplate(3)
                .switchToFrame(0)
                .fillField("field1[2]", "selezenev")
                .fillField("field1[1]", "valentin")
                .fillField("field1[3]", "ivanovich")
                .fillEmailField("selezenev23@mail.ru")
                .fillNumberField("12345678911")
                .selectProduct("Товар №2")
                .fillQuantityField("3")
                .fillAgeField("23")
                .submitForm();
    }
}