package config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:local.properties"
})
public interface LocalConfig extends Config {

    @Key("deviceName")
    String deviceName();

    @Key("platformVersion")
    String platformVersion();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();

    @Key("appium.url")
    String appiumUrl();

    @Key("app")
    String appPath();

    @Key("automation.name")
    String automationName();
}