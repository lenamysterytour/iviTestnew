package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RatePages;
import utils.RemoteTestBase;

import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.MINOR;

@Owner("ebolotnikova")
public class RateSeriesTest extends RemoteTestBase {

    RatePages ratePages = new RatePages();
    RemoteTestBase remoteTestBase = new RemoteTestBase();

    @Test
    @Tag("rate")
    @Severity(MINOR)
    @DisplayName("Rate series")
    public void rateSeries() {

        step("Open movie page", () -> {
            remoteTestBase.openPage();
            ratePages
                    .clickOnMoviePoster();
        });
        step("Give grade", () -> {
            ratePages.clickOnRateButton()
                    .giveGrade();
        });
        step("Check grade acceptance", () -> {
            ratePages.checkGradeAcceptanceIcon();
        });
    }
}
