package pages6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;

public class Test5Test {
    private AutoRuPage autoRuPage;

    @BeforeEach
    public void setUp() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        autoRuPage = new AutoRuPage();
    }

    @Test
    public void test5() {
        autoRuPage.openAutoRuPage();
        autoRuPage.goToDealers();
        autoRuPage.selectDealer();
        autoRuPage.openDealerProfile();
        autoRuPage.openImageGallery();
    }
}