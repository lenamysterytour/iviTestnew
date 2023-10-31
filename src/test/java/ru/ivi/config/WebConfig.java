package ru.ivi.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue("edge")
    String browser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("baseUrl")
    @DefaultValue("https://www.ivi.ru")
    String baseUrl();

    @Key("isRemote")
    @DefaultValue("true")
    boolean isRemote();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String remoteUrl();

    @Key("videoStorage")
    @DefaultValue("https://selenoid.autotests.cloud/video/")
    String videoStorage();
}