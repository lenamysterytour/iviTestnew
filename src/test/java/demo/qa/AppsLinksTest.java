package demo.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AppsPages;
import utils.RemoteTestBase;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

@Tag("iviApps")
public class AppsLinksTest extends RemoteTestBase {

    AppsPages appPages = new AppsPages();
    String downloadableText = "иви: сериалы, фильмы, мультики";

    @Test
    @DisplayName("Apple app Link")
    public void appleAppLink() {
        step("Open Ivi website", () -> {
            appPages.openPage();
        });
        step("Choose Link", () -> {
            appPages.chooseIoslink();
        });
        step("Check if app is there", () -> {
            $(byTagAndText("h3", downloadableText)).is(visible);
        });
        sleep(1000);
    }

    @Test
  //  @Tag("iviApps")
    @DisplayName("Android app Link")
    public void androidAppLink() {
        step("Open Ivi website", () -> {
            appPages.openPage();
        });
        step("Choose Link", () -> {
            appPages.chooseAndroidlink();
        });
        step("Check if app is there", () -> {
            $(byTagAndText("h3", downloadableText)).is(visible);
        });
    }

}
