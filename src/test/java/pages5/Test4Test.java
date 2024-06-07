package pages5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;
import page.TestBase;

public class Test4Test extends TestBase {
    FormDesignerPage formDesignerPage = new FormDesignerPage();
    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void test4() {
        formDesignerPage
                .openFormDesignerPage()
                .switchToFrame()
                .fillField25("valentin")
                .fillField26("selezenev@mail.ru")
                .fillField27("test")
                .fillField28("hello world")
                .submitForm();
    }
}