package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPages {

    private final SelenideElement searchBar = $(".headerTop__headerSearch");
    private final SelenideElement   searchInput = $("[data-test='search_input']");
    private final SelenideElement searchResult = $(".searchBlock__content");


    public SearchPages openPage(){
        open("/");
        $("[data-test='close-teaser-button']").click();
        return this;}

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

