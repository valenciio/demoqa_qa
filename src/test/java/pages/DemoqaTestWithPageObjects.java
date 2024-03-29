package pages;

import org.junit.jupiter.api.Test;

public class DemoqaTestWithPageObjects extends TestBase {
    @Test
    void fillPracticeFormTest() {
        String userName = "Valentin";

        registrationPage.openPage()
                .setFirstName("Valentin")
                .setLastName("Selezenev")
                .setEmail("selezenev@gmail.com")
                .setGender("Male")
                .setNumber("9876543210")
                .setBirthDate("23", "December", "1994")
                .setSubject("Arts")
                .setHobbies("Sports")
                .uploadPicture("cat.jpg")
                .setCurrentAddress("Moscow")
                .setState("NCR")
                .setCity("Delhi")
                .Submit("");

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Valentin Selezenev")
                .verifyResult("Student Email", "selezenev@gmail.com")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "9876543210")
                .verifyResult("Subjects", "Arts")
                .verifyResult("Hobbies", "Sports")
                .verifyResult("Date of Birth", "23 December,1994")
                .verifyResult("Picture", "cat.jpg")
                .verifyResult("Address", "Moscow");
    }
}
