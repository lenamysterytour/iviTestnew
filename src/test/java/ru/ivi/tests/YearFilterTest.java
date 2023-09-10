package ru.ivi.tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.ivi.pages.YearPages;
import ru.ivi.utils.RemoteTestBase;

import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("ebolotnikova")
public class YearFilterTest extends RemoteTestBase {

    @Test
    @Tag("yearFilter")
    @Severity(NORMAL)
    @DisplayName("Year filter test")
    public void yearFilter() {

        YearPages yearPages = new YearPages();
        RemoteTestBase remoteTestBase = new RemoteTestBase();

        step("Find 2023 films", () -> {
            remoteTestBase.openPage();
            yearPages
                    .findFilmsLink()
                    .click2023FilmsLink()
                    .moviePosterclick();
        });
        step("Check if year is correct", () -> {
            yearPages.chechFilmYear();
        });
    }
}
