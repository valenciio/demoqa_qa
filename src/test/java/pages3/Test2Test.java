package pages3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Test2Test extends TestBase {

    @BeforeEach
    public void setUp() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void test2() {
        mVideoHomePage
                .openHomePage()
                .clickCatalogButton()
                .clickAudioTechnicsLink();
    }
}
