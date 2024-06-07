package page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import google.DoodlesGooglePage;
import google.GoogleLensPage;
import google.GooglePage;
import org.junit.jupiter.api.BeforeAll;

import java.io.File;

public class TestBase {
  public GooglePage googlePage = new GooglePage();
  public DoodlesGooglePage doodlesGooglePage = new DoodlesGooglePage();
  public GoogleLensPage googleLensPage = new GoogleLensPage();
  RegistrationPage registrationPage = new RegistrationPage();
  File file = new File("src/test/resources/cat.jpg");

  @BeforeAll
  static void beforeAll() {
    //Configuration.browser = "Firefox";
    Configuration.browserSize = "1920x1080";
    Configuration.baseUrl = "https://demoqa.com";
    Configuration.pageLoadStrategy = "eager";
  }

  public static void goToUrl(String url) {
    Selenide.open(url);
  }
}
