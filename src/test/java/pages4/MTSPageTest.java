package pages4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MTSPageTest {

    private MTSPage mtsPage;

    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        mtsPage = new MTSPage();
        mtsPage.openMTSPage();
    }

    @Test
    public void testMTSPage() {
        mtsPage.clickFirstCard();
        mtsPage.clickSecondCard();
        mtsPage.clickUniversalCardButton();
        mtsPage.clickConnectButton();
        mtsPage.clickFirstConnectMethod();
    }
}
