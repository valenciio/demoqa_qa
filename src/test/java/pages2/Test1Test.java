package pages2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;

public class Test1Test {
    private FormDesignerPage formDesignerPage;

    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        formDesignerPage = new FormDesignerPage();
    }

    @Test
    public void test1() {
        open("https://formdesigner.ru/");
        formDesignerPage.formTemplate(3).click();
        formDesignerPage.switchToFrame(0);
        formDesignerPage.fillField("field1[2]", "selezenev");
        formDesignerPage.fillField("field1[1]", "valentin");
        formDesignerPage.fillField("field1[3]", "ivanovich");
        formDesignerPage.fillEmailField("selezenev23@mail.ru");
        formDesignerPage.fillNumberField("12345678911");
        formDesignerPage.selectProduct("Товар №2");
        formDesignerPage.fillQuantityField("3");
        formDesignerPage.fillAgeField("23");
        formDesignerPage.submitForm();
    }
}