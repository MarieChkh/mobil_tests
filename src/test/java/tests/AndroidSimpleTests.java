package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

@Tag("android")
public class AndroidSimpleTests extends TestBase {

    @BeforeAll
    static void setup() {
        System.setProperty("platform", "android");
        System.setProperty("app", "bs://sample.app");
    }

    @Test
    void searchTest() {
        step("Открытие страницы и начало поиска", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("One Piece");
        });

        step("Проверка найденного содержимого", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));

    }
}