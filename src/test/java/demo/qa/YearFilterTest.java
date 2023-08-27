package demo.qa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.YearPages;
import utils.RemoteTestBase;

import static com.codeborne.selenide.logevents.SelenideLogger.step;


public class YearFilterTest extends RemoteTestBase {

    @Test
    @Tag("yearFilter")
    public void yearFilter() {

        YearPages yearPages = new YearPages();

        step("Find 2023 films", () -> {
            yearPages.openPage()
                    .findFilmsLink()
                    .click2023FilmsLink()
                    .moviePosterclick();
        });
        step("Check if year is correct", () -> {
            yearPages.chechFilmYear();
        });
    }
}
