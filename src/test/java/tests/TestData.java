package tests;

import com.github.javafaker.Faker;

public class TestData {

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String phoneNumber = faker.phoneNumber().subscriberNumber(10);
}
