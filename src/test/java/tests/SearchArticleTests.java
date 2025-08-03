package tests;

import ScreenObjects.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

@Tags({
        @Tag("all_android_tests"),
        @Tag("search_article_tests")
})
@DisplayName("Проверка результатов поиска статей")
@Owner("Victalina")
@Epic("Мобильное приложение Wikipedia")
@Story("Поиск статей в приложении")
@Feature("Поиск статей в приложении")
public class SearchArticleTests extends TestBase {
    MainPage mainPage = new MainPage();
    @Test
    @DisplayName("Проверка результатов поиска статей по ключевому слову")
    @Severity(SeverityLevel.CRITICAL)
    void successfulSearchArticleTest() {

        step("Type text", () -> {
            mainPage.textButton();
            mainPage.setAppium();
        });
        step("Verify text", () -> mainPage.shouldhaveAppium());
    }
}