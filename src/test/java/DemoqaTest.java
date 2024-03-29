import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DemoqaTest {

    @BeforeAll
    static void beforeAll() {
        //Configuration.browser = "Firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    File file = new File("src/test/resources/cat.jpg");

    @Test
    void fillPracticeFormTest() {
        open("/automation-practice-form");
       executeJavaScript("$('#fixedban').remove()");
       executeJavaScript("$('footer').remove()");

        String firstName = "Valentin";
        String lastName = "Selezenev";
        String fullName = firstName + " " + lastName;
        String userEmail = "selezenev@gmail.com";
        String gender = "Male";
        String userNumber = "9876543210";
        String birthYear = "1994";
        String birthMonth = "December";
        String birthDay = "23";
        String birthDate = birthDay + " " + birthMonth + "," + birthYear;
        String currentAddress = "Saint-Petersburg";
        String subject1 = "Arts";
        String subject2 = "Physics";
        String subjects = subject1 + ", " + subject2;
        String hobby1 = "Music";
        String hobby2 = "Reading";
        String hobbies = hobby1 + ", " + hobby2;
        String img = "cat.jpg";
        String state = "Haryana";
        String city = "Karnal";
        String stateAndCity = state + " " + city;

        $("#firstName").setValue(String.valueOf(firstName));
        $("#lastName").setValue(String.valueOf(lastName));
        $("#userEmail").setValue(String.valueOf(userEmail));
        $("#genterWrapper").$(byText(String.valueOf(gender))).click();
        $("#userNumber").setValue(String.valueOf(userNumber));
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(birthMonth);
        $(".react-datepicker__year-select").selectOption(birthYear);
        $(".react-datepicker__day--0" + birthDay + ":not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue(subject1).click();
        $("#subjectsInput").val(String.valueOf(subject2)).pressEnter();
        $("#hobbies-checkbox-1").sibling(0).click();
        $("#hobbies-checkbox-2").sibling(0).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/cat.jpg"));
        $("#currentAddress").setValue(String.valueOf(currentAddress));
        $("#state").click();
        $("#stateCity-wrapper").$(byText(String.valueOf(state))).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(String.valueOf(city))).click();
        $("#submit").click();

       $(".modal-dialog").should(appear);
       $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
       $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text(String.valueOf(fullName)));
       $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text(String.valueOf(userEmail)));
    }
}
