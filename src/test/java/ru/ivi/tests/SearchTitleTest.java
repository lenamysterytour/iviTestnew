package ru.ivi.tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.ivi.pages.SearchPages;
import ru.ivi.utils.FakerPage;
import ru.ivi.utils.RemoteTestBase;

import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("ebolotnikova")
public class SearchTitleTest extends RemoteTestBase {

    SearchPages searchPages = new SearchPages();
    RemoteTestBase remoteTestBase = new RemoteTestBase();
    String fakeTitle = FakerPage.fakeTitle();

    @Test
    @Severity(NORMAL)
    @DisplayName("Search Title test")
    @Tag("searchTest")
    public void searchTitle() {

        step("Type into searchbar", () -> {
            remoteTestBase.openPage();
            searchPages
                    .clickSearchBar()
                    .typeInTitle(fakeTitle);

        });
        step("Check if result appears", () -> {
            searchPages.confirmTitle(fakeTitle);
        });

    }


}