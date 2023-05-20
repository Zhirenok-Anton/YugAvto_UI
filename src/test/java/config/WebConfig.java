package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("2500x1440")
    String getBrowserSize();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("baseUrl")
    @DefaultValue("https://yug-avto.ru")
    String getBaseUrl();
}