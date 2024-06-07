package pages4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages3.TestBase;


public class MTSPageTest extends TestBase {

    MTSPage mtsPage = new MTSPage();

    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void testMTSPage() {
        mtsPage
                .openMTSPage()
                .clickFirstCard()
                .clickSecondCard()
                .clickUniversalCardButton()
                .clickConnectButton()
                .clickFirstConnectMethod();
    }
}
