package pages2;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class FormDesignerPage {
    public SelenideElement formTemplate(int index) {
        return $(".form-template:nth-child(" + index + ") > .form-template__name");
    }

    public void switchToFrame(int index) {
        switchTo().frame(index);
    }

    public void fillField(String name, String value) {
        $(byName(name)).click();
        $(byName(name)).setValue(value);
    }

    public void fillEmailField(String value) {
        $(byId("field2")).click();
        $(byId("field2")).setValue(value);
    }

    public void fillNumberField(String value) {
        $(byId("field3")).click();
        $(byId("field3")).setValue(value);
    }

    public void selectProduct(String product) {
        $(byId("field4")).click();
        $(byId("field4")).selectOption(product);
    }

    public void fillQuantityField(String value) {
        $(byId("field5")).click();
        $(byId("field5")).setValue(value);
    }

    public void fillAgeField(String value) {
        $(byId("field6")).click();
        $(byId("field6")).setValue(value);
    }

    public void submitForm() {
        $(byName("submit")).click();
        $(".success_message.success_message-top").
                $(byText("Спасибо, Ваше сообщение успешно отправлено"));
    }
}