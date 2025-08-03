package tests;
import ScreenObjects.ArticlePage;
import ScreenObjects.MainPage;
import ScreenObjects.PopPage;
import ScreenObjects.ResultSearchPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


@Tag("ios_browserstack")
public class IosSimpleTest extends TestBase {

    MainPage mainPage = new MainPage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();
    PopPage popPage = new PopPage();
    ArticlePage articlePage = new ArticlePage();

    @BeforeAll
    static void setup() {
        System.setProperty("platform", "ios");
        System.setProperty("app", "bs://sample.app");
    }

    @Test
    @DisplayName("Проверка поиска")
    void openTest() {
        step("Type search", () -> {
            mainPage.search();
            mainPage.setSearchText();
        });

        step("Verify content found", () -> {
            resultSearchPage.checkResultSearch();

        });
    }
    @Test
    @DisplayName("Проверка по другому тексту")
    void typeTextTest() {

        step("Type text", () -> {
            mainPage.textButton();
            mainPage.setAppium();
        });
        step("Verify text", () ->
                mainPage.shouldhaveAppium());
    }
    @Test
    @DisplayName("Проверка онбординга")
    void iosOnboardingScreens() {
        step("Ввести ключевое слово в поиск", () -> {
            back();
            mainPage.search();
            mainPage.setSearchGit();
        });
        step("Открыть первую статью в результатах поиска", () -> {
                resultSearchPage.checkfirstSearch();
        });
        step("Закрыть поп-ап предложения игр", () -> {
                popPage.closepop();
    });
        step("Проверить открытую статью", () -> {
            articlePage.articlecheck();
        });
    }
}