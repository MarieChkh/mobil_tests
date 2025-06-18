package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class SimpleTests extends TestBase {
    @Tag("android")
    @Test
    void searchAndroidTest() {
        step("Open search field", () -> $(id("org.wikipedia.alpha:id/search_container")).click());
        step("Type 'Selenide'", () -> $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Selenide\n"));
        step("Verify search results", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0)));
    }

    @Tag("ios")
    @Test
    void searchIosTest() {
        step("Open search field", () -> $(id("org.wikipedia.alpha:id/search_container")).click());
        step("Type 'Selenide'", () -> $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Selenide\n"));
        step("Verify search results", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0)));
    }
}