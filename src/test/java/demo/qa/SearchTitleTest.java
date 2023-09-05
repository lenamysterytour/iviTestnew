package demo.qa;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchPages;
import utils.FakerPage;
import utils.RemoteTestBase;

import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("ebolotnikova")
public class SearchTitleTest extends RemoteTestBase {

    SearchPages searchPages = new SearchPages();
    RemoteTestBase remoteTestBase = new RemoteTestBase();
    String fakeTitle = FakerPage.fakeTitle();

    @Test
    @Severity(NORMAL)
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