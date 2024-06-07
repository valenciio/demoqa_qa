package google;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.TestBase;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static google.DoodlesGooglePage.exploreDoodles;
import static google.GoogleLensPage.errorMessage;
import static google.GoogleLensPage.noImageErrorMessage;
import static google.GooglePage.*;

public class GoogleTest extends TestBase {
  @BeforeEach
  public void setUp() {
    Configuration.browser = "firefox";
    Configuration.browserSize = "1920x1080";
    Configuration.pageLoadStrategy = "eager";
    TestBase.goToUrl(GooglePage.google);
  }

  @Test
  public void test1() {
    googlePage
            .checkElementIsDisplayed(brandLogo);
  }

  @Test
  public void test2() {
    googlePage
        .checkElementIsClickable(lucky);
  }

  @Test
  public void test5() {
    googlePage
        .checkElementIsClickable(mail);
  }

  @Test
  public void test6() {
    googlePage
        .checkElementIsClickable(pictures);
  }

  @Test
  public void test3() {
    googlePage
        .checkElementIsClickable(searchInGoogle);
  }

  @Test
  public void test4() {
    googlePage
        .clickOnElement(lucky);

    doodlesGooglePage
        .checkElementIsDisplayed(exploreDoodles);
  }

  @Test
  public void test7() {
    googlePage
        .checkElementIsClickable(searchByPicture);
  }

  @Test
  public void test8() {
    googlePage
        .clickOnElement(searchByPicture)
        .checkElementIsDisplayed(uploadFile);

  }

  @Test
  public void test9() {
    googlePage
        .clickOnElement(searchByPicture)
        .setFieldValue(pasteImageLinkInput, "http://qwerty")
        .clickOnElement(searchButton);

googleLensPage
        .checkElementIsDisplayed(noImageErrorMessage);

  }

  @Test
  public void test10() {
    googlePage
        .clickOnElement(searchByPicture)
        .setFieldValue(pasteImageLinkInput, "https://imgur.com/HKRBwwb")
        .clickOnElement(searchButton);

    googleLensPage
        .checkElementIsDisplayed(errorMessage);

  }

  @Test
  public void test11() {

    $x("(//input[@value='Мне повезёт!'])[2]").click();

    $$x("//img[@class='hero-tag-carousel__collage-card-img']").
            shouldHave(size(36));

  }

  @Test
  public void test12() {

    $x("(//input[@value='Мне повезёт!'])[2]").click();

    $$x("//img[@class='hero-tag-carousel__collage-card-img']")
            .forEach(element -> element.shouldHave(attribute("src")));

  }
}