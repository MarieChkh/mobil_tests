package ScreenObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class ResultSearchPage {

    public void checkResultSearch() { $$(id("org.wikipedia.alpha:id/page_list_item_title"))
            .shouldHave(sizeGreaterThan(0));}
    public void checkfirstSearch() { $$(id("org.wikipedia.alpha:id/page_list_item_title"))
            .first().click();}}

