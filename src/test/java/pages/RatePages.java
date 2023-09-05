package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RatePages {

    private final SelenideElement posterImage = $(".ivi-carousel-item").sibling(2);

    private final SelenideElement rateButton = $(byAttribute("data-test", "rate_button"));

    private final SelenideElement gradeFive = $(".nbl-optionSelector__optionWrapper").sibling(4);

    private final SelenideElement ratingSuccessIcon = $(".movie-rating__icon-success");


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
