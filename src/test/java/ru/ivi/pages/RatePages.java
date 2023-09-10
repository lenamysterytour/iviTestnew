package ru.ivi.pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class RatePages {

    private final SelenideElement posterImage = $(".ivi-carousel-item").sibling(2),

    rateButton = $(byAttribute("data-test", "rate_button")),

    gradeFive = $(".nbl-optionSelector__optionWrapper").sibling(4),

    ratingSuccessIcon = $(".movie-rating__icon-success");


    public RatePages clickOnMoviePoster() {
        posterImage.click();
        return this;
    }

    public RatePages clickOnRateButton() {
        rateButton.click();
        return this;
    }

    public RatePages giveGrade() {
        gradeFive.click();
        return this;
    }


    public RatePages checkGradeAcceptanceIcon() {
        ratingSuccessIcon.should(appear);
        return this;
    }
}
