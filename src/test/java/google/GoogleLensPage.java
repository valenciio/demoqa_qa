package google;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GoogleLensPage {

  public static SelenideElement noImageErrorMessage = $x("//div[.='URL не ведет к изображению']");
  public static SelenideElement errorMessage = $x("//div[.='Произошла ошибка.']");


  public GoogleLensPage checkElementEqualsText(SelenideElement element, String expectedValue) {
    String actualValue = element.getText();

    assertEquals(
        actualValue, expectedValue,
        String.format("Элемент \"%s\" не содержит текст, равный \"%s\"", element, expectedValue));
    return this;
  }

  public GoogleLensPage checkElementIsDisplayed(SelenideElement element) {
    element.should(Condition.visible);

    return this;
  }

  public GoogleLensPage checkElementIsNotDisplayed(SelenideElement element) {
    element.shouldNot(Condition.visible);

    return this;
  }

  public GoogleLensPage checkElementIsClickable(SelenideElement element) {
    element.should(Condition.clickable);

    return this;
  }

  public GoogleLensPage checkElementIsNotClickable(SelenideElement element) {
    element.shouldNot(Condition.clickable);

    return this;
  }

  public GoogleLensPage clickOnElement(SelenideElement element) {
    element.click();

    return this;
  }

}