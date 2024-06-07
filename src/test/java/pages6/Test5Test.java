package pages6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;
import page.TestBase;

public class Test5Test extends TestBase {
    AutoRuPage autoRuPage = new AutoRuPage();

    @BeforeEach
    public void setUp() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void test5() {
        autoRuPage
                .openAutoRuPage()
                .goToDealers()
                .selectDealer()
                .openDealerProfile()
                .openImageGallery();
    }
}