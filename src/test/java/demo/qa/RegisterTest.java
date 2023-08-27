package demo.qa;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegisterPages;
import utils.RemoteTestBase;


import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class RegisterTest extends RemoteTestBase {

    @Test
    @Tag("initialRegister")
    public void initialRegisterTest() {

        RegisterPages registerPages = new RegisterPages();
        Faker faker = new Faker();

        String fakeEmail = faker.internet().emailAddress(),
                fakepassword = faker.internet().password();

        step("Open page", () -> {
            registerPages.openPage()
                    .clickLoginAndRegister();
        });
        step("Fill in inputs", () -> {
            registerPages.setEmail(fakeEmail)
                    .pushContinueButton()
                    .setPassword(fakepassword)
                    .pushContinueButton()
                    .repeatPassword(fakepassword)
                    .pushContinueButton();
        });
        step("Check registration is done", () -> {
            registerPages.checkSuccessRegister();
        });

    }

    @Test
    @Tag("initialRegister")
    public void initialRegisterEmailWithNoAtSignTest() {

        RegisterPages registerPages = new RegisterPages();
        Faker faker = new Faker();

        String fakeBadEmail = faker.letterify("######" + ".com");

        step("Open page", () -> {
            registerPages.openPage()
                    .clickLoginAndRegister();
        });
        step("Fill in inputs, email with no At sign", () -> {
            registerPages.setEmail(fakeBadEmail)
                    .pushContinueButton();
        });
        step("Check registration is not done", () -> {
            registerPages.checkErrorRegister();
        });
    }
}
