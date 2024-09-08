package uiTests.positive;

import uiTests.helpers.TestBaseExtended;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class LanguageChangeEnToEsTest extends TestBaseExtended {
    @Test
    public void languageChangeEnToEsTest() {

        step("Open the Main Page", () -> {
            open("https://www.visahq.com/");
        });
        step("Click on the Language Selector", () -> {
            $(".popup-menu__button__name").click();
        });
        step("Select 'Español' as the Language", () -> {
            $(byText("Español")).click();
        });
        step("Verify the Banner Title Changes to 'Requisitos de Visa Viajes'", () -> {
            $(".index__banner__title").shouldHave(text(" Requisitos de Visa Viajes "));
        });
    }
}
