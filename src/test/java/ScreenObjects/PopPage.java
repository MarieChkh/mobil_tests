package ScreenObjects;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class PopPage {
    public void closepop() { $(id("org.wikipedia.alpha:id/closeButton")).click();
    }

}
