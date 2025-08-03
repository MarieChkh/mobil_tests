package ScreenObjects;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {
    private SelenideElement primaryTextView = $(By.id("org.wikipedia.alpha:id/primaryTextView"));
    private SelenideElement textInput = $(accessibilityId("Text Input"));
    private SelenideElement searchsrctext = $(id("org.wikipedia.alpha:id/search_src_text"));

    public void search() { $(accessibilityId("Search Wikipedia")).click();
    }

    public void freeEncyclopedia() { primaryTextView
            .shouldHave(text("The Free Encyclopedia"));
    }
    public void newwaystoexplore() { primaryTextView
            .shouldHave(text("New ways to explore"));
    }
    public void readinglists() {primaryTextView
            .shouldHave(text("Reading lists with sync"));
    }
    public void dataprivacy() { primaryTextView
            .shouldHave(text("Data & Privacy"));
    }
    public void farwordbuttonclick() {$(By.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
            .shouldBe(enabled)
            .click();
    }
    public void setSearchText() { searchsrctext.sendKeys("Selenide");
    }

    public void setSearchGit() { searchsrctext.sendKeys("Github");
    }

    public void textButton() { $(accessibilityId("Text Button")).click();
    }

    public void setAppium() { textInput.sendKeys("Appium");
    }
    public void shouldhaveAppium() { textInput.shouldHave(Condition.value("Appium"));
    }

}
