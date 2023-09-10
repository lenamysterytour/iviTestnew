package ru.ivi.utils;

import com.github.javafaker.Faker;
public class FakerPage {

static Faker faker = new Faker();
public static String fakeTitle()
{
    String[] titles = {"Райские яблочки", "Тихий центр", "Я никогда не плачу"};
    return faker.options().option(titles);
}

}
