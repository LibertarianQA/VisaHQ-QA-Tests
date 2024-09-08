package uiTests.positive;

import uiTests.helpers.TestBaseExtended;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ForCitizensOfBelarusTravelingToUnitedKingdom extends TestBaseExtended {

    @Test
    public void forCitizensOfBelarusTravelingToUnitedKingdom() {

        step("Open the Main Page", () -> {
            open("https://www.visahq.com/");
        });
        step("Select 'Belarus' as the Country of Citizenship", () -> {
            $("#select2-chosen-1").click();
            $("#s2id_autogen1_search").setValue("Belarus").pressEnter();
        });
        step("Select 'United Kingdom' as the Destination Country", () -> {
            $("#select2-chosen-2").click();
            $("#s2id_autogen2_search").setValue("United Kingdom").pressEnter();
        });
        step("Submit the Visa Search Form", () -> {
            $("#submit-cntr-dest2-top").click();
        });
        step("Verify 'United Kingdom Visa Types' Text is Displayed", () -> {
            $("#articles_upper").shouldHave(text("United Kingdom Visa Types"));
        });
    }
}
