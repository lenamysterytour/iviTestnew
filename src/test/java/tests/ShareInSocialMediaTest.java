package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SmmPages;
import utils.RemoteTestBase;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("ebolotnikova")

public class ShareInSocialMediaTest extends RemoteTestBase {


    @Test
    @Severity(NORMAL)
    @DisplayName("Share in Social media test")
    @Tag("shareTelegram")
    public void shareInSocialMedia() {

        SmmPages smmPages = new SmmPages();
        RemoteTestBase remoteTestBase = new RemoteTestBase();
        String telegramText = "Telegram";


        step("Open movie page", () -> {
            remoteTestBase.openPage();
            smmPages.
                    clickOnMoviePoster();
        });
        step("Share in social media", () -> {
            smmPages.clickShareButton()
                    .telegramTextPresenceCheck(telegramText)
                    .clickTelegramShareButton();
        });
        step("Check if share window appears", () -> {
            switchTo().window(1);
            smmPages.smmWindowCheck()
                    .movieLinkCheck()
                    .shareButtonCheck();
        });

    }
}
