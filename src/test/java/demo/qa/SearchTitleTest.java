package demo.qa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchPages;
import utils.FakerPage;
import utils.RemoteTestBase;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class SearchTitleTest extends RemoteTestBase {

    SearchPages searchPages = new SearchPages();
    String fakeTitle = FakerPage.fakeTitle();

    @Test
    @Tag("searchTest")
    public void searchTitle() {

        step("Type into searchbar", () -> {
            searchPages.openPage()
                    .clickSearchBar()
                    .typeInTitle(fakeTitle);

        });
        step("Check if result appears", () -> {
               searchPages.confirmTitle(fakeTitle);
        });

    }


}