package ru.ivi.utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.ivi.helpers.Attach;


import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RemoteTestBase {

    private SelenideElement acceptCookieWindow = $("[data-test='close-teaser-button']");

    @BeforeAll
    static void beforeAll() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://ivi.ru";

        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;

    }

    @AfterEach
    void afterEach() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }

    public RemoteTestBase openPage() {
        open("/");
        if ($(acceptCookieWindow).is(Condition.appear)) {
            $(acceptCookieWindow).click();
        }
        return this;
    }
}