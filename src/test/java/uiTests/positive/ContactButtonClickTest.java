package uiTests.positive;

import uiTests.helpers.TestBaseExtended;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("regression_testing")
public class ContactButtonClickTest extends TestBaseExtended {

    @Test
    public void contactButtonClickTest() {

        step("Open the Main Page", () -> {
            open("https://www.visahq.com/");
        });
        step("Click on the 'Contact' Menu Item", () -> {
            $(".menu-list-contact").click();
        });
        step("Verify the Address Text '1701 Rhode Island Ave NW' is Displayed", () -> {
            $(".adr").shouldHave(text("1701 Rhode Island Ave NW"));
        });
    }
}
