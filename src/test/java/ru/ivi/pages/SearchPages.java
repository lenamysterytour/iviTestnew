package ru.ivi.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchPages {

    private final SelenideElement searchBar = $(".headerTop__headerSearch"),
            searchInput = $("[data-test='search_input']"),
            searchResult = $(".searchBlock__content");


    public SearchPages typeInTitle(String value) {
        searchInput.setValue(value).pressEnter();
        return this;
    }

    public SearchPages clickSearchBar() {
        searchBar.click();
        return this;
    }

    public SearchPages confirmTitle(String value) {
        searchResult.shouldHave(text(value));
        return this;
    }

}

