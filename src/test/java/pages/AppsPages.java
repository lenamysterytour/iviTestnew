package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;

public class AppsPages {

    private final SelenideElement appleApplink = $(byAttribute("href", "https://go.onelink.me/app/devicesiOS"));
    private final SelenideElement androidAppLink = $(byAttribute("href", "https://go.onelink.me/app/devicesAndroid"));


    public AppsPages chooseIoslink() {
        appleApplink.click();
        return this;
    }

    public AppsPages chooseAndroidlink() {
        androidAppLink.click();
        return this;
    }

}