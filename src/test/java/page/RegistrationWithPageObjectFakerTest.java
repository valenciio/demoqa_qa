package page;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static tests.randomUtils.GenerateRandom.cityGenerator;

public class RegistrationWithPageObjectFakerTest extends TestBase {
    Faker faker = new Faker();

    @Test
    void fillPracticeFormTest() {
        String userName = faker.name().firstName();
        String surName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String gender = faker.options().option("Male","Female","Other");
        String phone = faker.phoneNumber().subscriberNumber(10);
        String day = String.format("%02d", faker.number().numberBetween(1, 28));
        String month = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        String year = faker.number().numberBetween(1900, 2022) + "";
        String object = faker.options().option("Hindi", "Social Studies", "Data Science");
        String hobby = faker.options().option("Sports");
        String file = "cat.jpg";
        String address = faker.address().fullAddress();
        String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");;
        String city = cityGenerator(state);


        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(surName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(phone)
                .setBirthDate(day, month, year)
                .setSubject(object)
                .setHobby(hobby)
                .uploadPicture("cat.jpg")
                .setCurrentAddress(address)
                .setState(state)
                .setCity(city)
                .Submit("");
        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", userName + " " + surName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", phone)
                .verifyResult("Date of Birth", day + " " + month + "," + year)
                .verifyResult("Subjects", object)
                .verifyResult("Hobbies", hobby)
                .verifyResult("Picture", "cat.jpg")
                .verifyResult("Address", address)
                .verifyResult("State and City", state + " " + city);
    }
}