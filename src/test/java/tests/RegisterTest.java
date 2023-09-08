package tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegisterPages;
import utils.RemoteTestBase;


import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.CRITICAL;

@Owner("ebolotnikova")
public class RegisterTest extends RemoteTestBase {

    @Test
    @Severity(CRITICAL)
    @DisplayName("Initial register test")
    @Tag("initialRegister")
    public void initialRegisterTest() {

        RegisterPages registerPages = new RegisterPages();
        RemoteTestBase remoteTestBase = new RemoteTestBase();
        Faker faker = new Faker();

        String fakeEmail = faker.internet().emailAddress(),
                fakepassword = faker.internet().password();

        step("Open page", () -> {
            remoteTestBase.openPage();
            registerPages
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
    @Severity(CRITICAL)
    @DisplayName("Initial register with bad email")
    @Tag("initialRegister")
    public void initialRegisterEmailWithNoAtSignTest() {

        RegisterPages registerPages = new RegisterPages();
        RemoteTestBase remoteTestBase = new RemoteTestBase();
        Faker faker = new Faker();

        String fakeBadEmail = faker.letterify("######" + ".com");

        step("Open page", () -> {
            remoteTestBase.openPage();
            registerPages
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
