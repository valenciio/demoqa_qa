package pages3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import java.io.File;

public class TestBase {
    MVideoHomePage mVideoHomePage = new MVideoHomePage();
    @BeforeAll
    static void beforeAll() {
        //Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }
    File file = new File("src/test/resources/cat.jpg");
}