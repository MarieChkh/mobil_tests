package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;

@Tag("ios")
public class IosSimpleTests extends tests.TestBase {

    @BeforeAll
    static void setup() {
        System.setProperty("platform", "ios");
        System.setProperty("app", "bs://sample.app");
    }

    @Test
    void searchTest() {
        step("Открытие страницы и начало поиска", () -> {
            $(accessibilityId("Text Button")).click();
            $(accessibilityId("Text Input")).sendKeys("One Piece" + "\n");
        });

        step("Проверка найденного содержимого", () ->
                $$(accessibilityId("Text Output"))
                        .shouldHave(sizeGreaterThan(0)));
    }
}