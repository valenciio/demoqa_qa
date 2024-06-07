package pages2;

import com.codeborne.selenide.SelenideElement;
import page.TestBase;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class FormDesignerPage extends TestBase {


    public FormDesignerPage formTemplate(int index) {
        SelenideElement element = $(".form-template:nth-child(" + index + ") > .form-template__name");
        element.click();
        return this;
    }

    public SelenideElement formTemplate111(int index) {
        return $(".form-template:nth-child(" + index + ") > .form-template__name");

    }

    public FormDesignerPage switchToFrame(int index) {
        switchTo().frame(index);
        return this;
    }

    public FormDesignerPage fillField(String name, String value) {
        $(byName(name)).setValue(value);
        return this;
    }

    public FormDesignerPage fillEmailField(String value) {
        $(byId("field2")).setValue(value);
        return this;
    }

    public FormDesignerPage fillNumberField(String value) {
        $(byId("field3")).setValue(value);
        return this;
    }

    public FormDesignerPage selectProduct(String product) {
        $(byId("field4")).selectOption(product);
        return this;
    }

    public FormDesignerPage fillQuantityField(String value) {
        $(byId("field5")).setValue(value);
        return this;
    }

    public FormDesignerPage fillAgeField(String value) {
        $(byId("field6")).setValue(value);
        return this;
    }

    public FormDesignerPage submitForm() {
        $(".success_message.success_message-top").
                $(byText("Спасибо, Ваше сообщение успешно отправлено"));
        return this;
    }
}