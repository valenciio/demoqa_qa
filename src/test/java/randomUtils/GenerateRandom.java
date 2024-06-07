package tests.randomUtils;

import com.github.javafaker.Faker;

public class GenerateRandom {
    static Faker faker = new Faker();

    public  static String cityGenerator(String state){
        if (state.equals("NCR")) return faker.options().option("Delhi", "Gurgaon", "Noida");
        else if (state.equals("Uttar Pradesh")) return faker.options().option("Agra", "Lucknow", "Merrut");
        else if (state.equals("Haryana")) return faker.options().option("Karnal", "Panipat");
        return "";
    }
}