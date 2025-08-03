package ScreenObjects;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class ArticlePage {
    public void articlecheck() {  $(xpath("//android.view.View[@resource-id='pcs']")).shouldBe(visible);
        $(xpath("//android.view.View[@text='GitHub']")).shouldBe(visible);
    }
}
