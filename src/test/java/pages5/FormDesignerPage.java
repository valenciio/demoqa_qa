package pages5;
import page.TestBase;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormDesignerPage extends TestBase {
    public FormDesignerPage openFormDesignerPage() {
        open("https://formdesigner.ru/");
        return this;
    }

    public FormDesignerPage switchToFrame() {
        switchTo().frame(0);
        return this;
    }

    public FormDesignerPage fillField25(String value) {
        $("#field25").setValue(value);
        return this;
    }

    public FormDesignerPage fillField26(String value) {
        $("#field26").setValue(value);
        return this;
    }

    public FormDesignerPage fillField27(String value) {
        $("#field27").setValue(value);
        return this;
    }

    public FormDesignerPage fillField28(String value) {
        $("#field28").setValue(value);
        return this;
    }
    public FormDesignerPage submitForm() {
        $(".success_message success_message-top").
                $(byText("Спасибо, Ваше сообщение успешно отправлено"));
        return this;
    }
}
