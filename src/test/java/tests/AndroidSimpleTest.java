package tests;

import ScreenObjects.MainPage;
import ScreenObjects.ResultSearchPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;

@Tag("android_browserstack")
public class AndroidSimpleTest extends TestBase {
    MainPage mainPage = new MainPage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();

    @BeforeAll
    static void setup() {
        System.setProperty("platform", "android");
        System.setProperty("app", "bs://sample.app");
    }

    @Test
    @DisplayName("Проверка поиска")
    void openSelenideTest() {
        step("Type search", () -> {
            mainPage.search();
            mainPage.setSearchText();
        });

        step("Verify content found", () -> {
            resultSearchPage.checkResultSearch();

        });
    }

    @Test
    @DisplayName("Проверка онбодинга")
    void androidOnboardingScreens() {
        step("Проверка первого экрана онбординга", () -> {
           mainPage.freeEncyclopedia();
           mainPage.farwordbuttonclick();
        });

        step("Проверка второго экрана онбординга", () -> {
            mainPage.newwaystoexplore();
            mainPage.farwordbuttonclick();
        });

        step("Проверка третьего экрана онбординга", () -> {
            mainPage.readinglists();
            mainPage.farwordbuttonclick();
        });

        step("Проверка четвертого экрана онбординга", () -> {
            mainPage.dataprivacy();
            mainPage.farwordbuttonclick();
        });
    }
}