package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties",
        "classpath:local.properties"})
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    String getBaseUrl();

    @Key("browserSize")
    String getBrowserSize();

    @Key("browserName")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("remote")
    String getRemoteUrl();
}
