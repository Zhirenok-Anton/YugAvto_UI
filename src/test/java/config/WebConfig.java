package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "classpath:${env}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browser_version")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("browser_size")
    @DefaultValue("2500x1440")
    String getBrowserSize();

    @Key("remote_url")
    String getRemoteUrl();

    @Key("base_url")
    @DefaultValue("https://yug-avto.ru")
    String getBaseUrl();
}