package demo.qa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SmmPages;
import utils.RemoteTestBase;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class ShareInSocialMediaTest extends RemoteTestBase {


    @Test
    @Tag("shareTelegram")
    public void shareInSocialMedia() {

        SmmPages smmPages = new SmmPages();
        String telegramText = "Telegram";


        step("Open movie page", () -> {
            smmPages.openPage()
                    .clickOnMoviePoster();
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
