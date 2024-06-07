package google;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GooglePage {

  public static String google = "https://www.google.ru/";

  public static SelenideElement brandLogo = $x("//img[@alt='Google']");
  public static SelenideElement mail = $x("//div/a[.='Почта']");
  public static SelenideElement pictures = $x("//div/a[.='Картинки']");
  public static SelenideElement searchButton = $x("//div/div[.='Search']");

  public static SelenideElement searchInGoogle = $x("(//input[@value='Поиск в Google'])[2]");
  public static SelenideElement searchByPicture = $x("//div[@data-base-lens-url='https://lens.google.com']");
  public static SelenideElement uploadFile = $x("//span[.='upload a file  ']");
  public static SelenideElement pasteImageLinkInput = $x("//input[@placeholder='Paste image link']");

  public static SelenideElement lucky = $x("(//input[@value='Мне повезёт!'])[2]");


  public GooglePage checkElementEqualsText(SelenideElement element, String expectedValue) {
    String actualValue = element.getText();

    assertEquals(
        actualValue, expectedValue,
        String.format("Элемент \"%s\" не содержит текст, равный \"%s\"", element, expectedValue));
    return this;
  }

  public GooglePage checkElementIsDisplayed(SelenideElement element) {
    element.should(Condition.visible);

    return this;
  }

  public GooglePage checkElementIsNotDisplayed(SelenideElement element) {
    element.shouldNot(Condition.visible);

    return this;
  }

  public GooglePage checkElementIsClickable(SelenideElement element) {
    element.should(Condition.clickable);

    return this;
  }

  public GooglePage checkElementIsNotClickable(SelenideElement element) {
    element.shouldNot(Condition.clickable);

    return this;
  }

  public GooglePage clickOnElement(SelenideElement element) {
    element.click();

    return this;
  }


  public GooglePage setFieldValue(SelenideElement element, String value) {
    element.sendKeys(value);

    return this;
  }

}