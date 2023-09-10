package ru.ivi.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class YearPages {

    private final SelenideElement menuFilmLink = $(".headerMenu__listItem").sibling(1),

    films2023Link = $(byLinkText("Фильмы 2023 года")),

    postersImage = $(".gallery__item").sibling(0),

    cardContent = $(".contentCard__info").$(withText("2023"));


    public YearPages findFilmsLink() {
        menuFilmLink.hover();
        return this;
    }

    public YearPages click2023FilmsLink() {
        films2023Link.click();
        return this;
    }

    public YearPages moviePosterclick() {
        postersImage.click();
        return this;
    }

    public YearPages chechFilmYear() {
        cardContent.should(appear);
        return this;
    }


}