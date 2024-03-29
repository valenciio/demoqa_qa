package pages3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test2Test {
    private MVideoHomePage mVideoHomePage;

    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        mVideoHomePage = new MVideoHomePage();
    }

    @Test
    public void test2() {
        mVideoHomePage.openHomePage();
        mVideoHomePage.clickCatalogButton();
        mVideoHomePage.clickAudioTechnicsLink();
    }
}
