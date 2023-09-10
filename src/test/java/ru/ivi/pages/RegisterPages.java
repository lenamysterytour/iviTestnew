package ru.ivi.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPages {

    private final SelenideElement loginButton = $(".headerTop__headerAvatar"),
            loginOrRegisterLink = $(withText("регистр")),
            loginInput = $("[data-test='input_login']"),
            passwordInput = $("[data-test='input_password']"),
            passwordRepeatInput = $("[data-test='input_password_repeat']"),
            continueButton = $("[data-test='button_continue']"),
            successMessage = $("[data-test='message_success']"),
            errorMessage = $("[data-test='chat_error']");


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
