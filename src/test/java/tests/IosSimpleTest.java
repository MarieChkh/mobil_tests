package tests;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

@Tag("ios_browserstack")
public class IosSimpleTest extends TestBase {

    @BeforeAll
    static void setup() {
        System.setProperty("platform", "ios");
        System.setProperty("app", "bs://sample.app");
    }

    @Test
    @DisplayName("Проверка поиска")
    void openSelenideTest() {
        step("Type search", () -> {
            $(accessibilityId("Text Button")).click();
            $(accessibilityId("Text Input")).sendKeys("Selenide" + "\n");
        });

        step("Verify content found", () ->
                $$(accessibilityId("Text Output"))
                        .shouldHave(sizeGreaterThan(0)));
    }
    @Test
    @DisplayName("Проверка по другому тексту")
    void typeTextTest() {

        step("Type text", () -> {
            $(accessibilityId("Text Button")).click();
            $(accessibilityId("Text Input")).sendKeys("Appium");
        });
        step("Verify text", () ->
                $(accessibilityId("Text Input"))
                        .shouldHave(Condition.value("Appium")));
    }
    @Test
    @DisplayName("Проверка онбодинга")
    void completeOnboardingScreens() {
        step("Проверка первого экрана онбординга", () -> {
            $(By.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("The Free Encyclopedia"));
            $(By.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                    .click();
        });

        step("Проверка второго экрана онбординга", () -> {
            $(By.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("New ways to explore"));
            $(By.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                    .shouldBe(enabled)
                    .click();
        });

        step("Проверка третьего экрана онбординга", () -> {
            $(By.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Reading lists with sync"));
            $(By.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                    .shouldBe(enabled)
                    .click();
        });

        step("Проверка четвертого экрана онбординга", () -> {
            $(By.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Data & Privacy"));
        });
    }
}