package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegisterPages {

    private final SelenideElement loginButton = $(".headerTop__headerAvatar");
    private final SelenideElement loginOrRegisterLink = $(withText("регистр"));
    private final SelenideElement loginInput = $("[data-test='input_login']");
    private final SelenideElement passwordInput = $("[data-test='input_password']");
    private final SelenideElement passwordRepeatInput = $("[data-test='input_password_repeat']");
    private final SelenideElement continueButton = $("[data-test='button_continue']");
    private final SelenideElement successMessage = $("[data-test='message_success']");
    private final SelenideElement errorMessage = $("[data-test='chat_error']");


    public RegisterPages clickLoginAndRegister() {
        loginButton.hover();
        loginOrRegisterLink.click();
        return this;
    }

    public RegisterPages setEmail(String value) {
        loginInput.setValue(value);
        return this;
    }

    public RegisterPages setPassword(String value) {
        passwordInput.setValue(value);
        return this;
    }

    public RegisterPages repeatPassword(String value) {
        passwordRepeatInput.setValue(value);
        return this;
    }

    public RegisterPages pushContinueButton() {
        continueButton.click();
        return this;
    }

    public RegisterPages checkSuccessRegister() {
        successMessage.should(appear);
        return this;
    }

    public RegisterPages checkErrorRegister() {
        errorMessage.should(appear);
        return this;
    }


}
