package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AppsPages;
import utils.RemoteTestBase;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Tag("iviApps")
@Owner("ebolotnikova")
public class AppsLinksTest extends RemoteTestBase {

    AppsPages appPages = new AppsPages();
    RemoteTestBase remoteTestBase = new RemoteTestBase();
    String downloadableText = "иви: сериалы, фильмы, мультики";

    @Test
    @Severity(NORMAL)
    @DisplayName("Apple app Link")
    public void appleAppLink() {
        step("Open Ivi website", () -> {
            remoteTestBase.openPage();
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
    @Severity(NORMAL)
    @DisplayName("Android app Link")
    public void androidAppLink() {
        step("Open Ivi website", () -> {
            remoteTestBase.openPage();
        });
        step("Choose Link", () -> {
            appPages.chooseAndroidlink();
        });
        step("Check if app is there", () -> {
            $(byTagAndText("h3", downloadableText)).is(visible);
        });
    }

}
