package pages5;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormDesignerPage {
    public void openFormDesignerPage() {
        open("https://formdesigner.ru/");
    }

    public void switchToFrame() {
        switchTo().frame(0);
    }

    public void fillField25(String value) {
        $("#field25").click();
        $("#field25").setValue(value);
    }

    public void fillField26(String value) {
        $("#field26").click();
        $("#field26").setValue(value);
    }

    public void fillField27(String value) {
        $("#field27").click();
        $("#field27").setValue(value);
    }

    public void fillField28(String value) {
        $("#field28").click();
        $("#field28").setValue(value);
    }
    public void submitForm() {
        $(byName("submit")).click();
        $(".success_message success_message-top").
                $(byText("Спасибо, Ваше сообщение успешно отправлено"));
    }
}
