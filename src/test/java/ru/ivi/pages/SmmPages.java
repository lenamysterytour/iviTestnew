package ru.ivi.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class SmmPages {

    private final SelenideElement posterImage = $(".ivi-carousel"),

    shareButton = $(".userButtons__item_share"),

    shareWindow = $(".socialShareModal"),

    telegramLink = $(byAttribute("src", "https://solea-parent.dfs.ivi.ru/picture/a5a1b2,a5a1b2/social_telegram.svg")),

    telegramShareWindow = $(".tgme_page"),

    movieLink = $(withText("https://www.ivi.tv/watch/")),

    telegramShareButton = $(".tgme_action_button_new");


    public SmmPages clickOnMoviePoster() {
        posterImage.click();
        return this;
    }

    public SmmPages clickShareButton() {
        shareButton.click();
        return this;
    }

    public SmmPages telegramTextPresenceCheck(String value) {
        shareWindow.shouldHave(text(value));
        return this;
    }

    public SmmPages clickTelegramShareButton() {
        telegramLink.click();
        return this;
    }

    public SmmPages smmWindowCheck() {
        telegramShareWindow.should(appear);
        return this;
    }

    public SmmPages movieLinkCheck() {
        movieLink.should(appear);
        return this;
    }

    public SmmPages shareButtonCheck() {
        telegramShareButton.should(appear);
        return this;
    }


}
