package google;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoodlesGooglePage {

  public static SelenideElement exploreDoodles = $x("//h2[.='Explore interactive Doodles']");


  public DoodlesGooglePage checkElementEqualsText(SelenideElement element, String expectedValue) {
    String actualValue = element.getText();

    assertEquals(
        actualValue, expectedValue,
        String.format("Элемент \"%s\" не содержит текст, равный \"%s\"", element, expectedValue));
    return this;
  }

  public DoodlesGooglePage checkElementIsDisplayed(SelenideElement element) {
    element.should(Condition.visible);

    return this;
  }

  public DoodlesGooglePage checkElementIsNotDisplayed(SelenideElement element) {
    element.shouldNot(Condition.visible);

    return this;
  }

  public DoodlesGooglePage checkElementIsClickable(SelenideElement element) {
    element.should(Condition.clickable);

    return this;
  }

  public DoodlesGooglePage checkElementIsNotClickable(SelenideElement element) {
    element.shouldNot(Condition.clickable);

    return this;
  }

  public DoodlesGooglePage clickOnElement(SelenideElement element) {
    element.click();

    return this;
  }

}