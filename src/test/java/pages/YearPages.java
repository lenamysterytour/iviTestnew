package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class YearPages {

    private final SelenideElement menuFilmLink = $(".headerMenu__listItem").sibling(1);

    private final SelenideElement films2023Link = $(byLinkText("Фильмы 2023 года"));

    private final SelenideElement postersImage = $(".gallery__item").sibling(0);

    private final SelenideElement cardContent = $(".contentCard__info").$(withText("2023"));



    public YearPages openPage() {
        open("/");
        $("[data-test='close-teaser-button']").click();
        return this;
    }

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