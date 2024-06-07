package page;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();
    private static final String titleText = "Student Registration Form";
    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(titleText));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }
    public RegistrationPage setFirstName(String value) {
        $("#firstName").setValue(value);

        return this;
    }
    public RegistrationPage setLastName(String value) {
        $("#lastName").setValue(value);

        return this;
    }
    public RegistrationPage setEmail(String value) {
        $("#userEmail").setValue(value);

        return this;
    }
    public RegistrationPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();

        return this;
    }
    public RegistrationPage setNumber(String value) {
        $("#userNumber").setValue(value);

        return this;
    }
    public RegistrationPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);

        return this;
    }
    public RegistrationPage setSubject(String value) {
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setHobby(String value) {
        $("#hobbies-checkbox-1").sibling(0).click();

        return this;
    }

    public RegistrationPage uploadPicture(String value) {
        $("#uploadPicture").uploadFile(new File("src/test/resources/cat.jpg"));

        return this;
    }
    public RegistrationPage setCurrentAddress(String value){
        $("#currentAddress").setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(value)).click();

        return this;
    }

    public RegistrationPage setCity(String value) {
        $("#city").click();
        $("#stateCity-wrapper").$(byText(value)).click();

        return this;
    }
    public RegistrationPage Submit(String value) {
        $("#submit").click();

        return this;
    }
    public RegistrationPage verifyResultsModalAppears() {
        RegistrationResultsModal.verifyModalAppears();

        return this;
    }
    public RegistrationPage verifyResult(String key, String value) {
        registrationResultsModal.verifyResult(key, value);

        return this;
    }
}
