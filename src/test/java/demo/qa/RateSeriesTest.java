package demo.qa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RatePages;
import utils.RemoteTestBase;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class RateSeriesTest extends RemoteTestBase {

    RatePages ratePages = new RatePages();

    @Test
    @Tag("rate")
    public void rateSeries() {

        step("Open movie page",() -> {
        ratePages.openPage()
                .clickOnMoviePoster();});
       step("Give grade",() -> {
                ratePages.clickOnRateButton()
                .giveGrade(); });
       step("Check grade acceptance",() -> {
                ratePages.checkGradeAcceptanceIcon();});
    }
}
