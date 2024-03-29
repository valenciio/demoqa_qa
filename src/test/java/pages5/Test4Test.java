package pages5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;
import pages4.MTSPage;

public class Test4Test {
    private FormDesignerPage formDesignerPage;

    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        formDesignerPage = new FormDesignerPage();
    }

    @Test
    public void test4() {
        formDesignerPage.openFormDesignerPage();
        formDesignerPage.switchToFrame();
        formDesignerPage.fillField25("valentin");
        formDesignerPage.fillField26("selezenev@mail.ru");
        formDesignerPage.fillField27("test");
        formDesignerPage.fillField28("hello world");
        formDesignerPage.submitForm();
    }
}