package uiTests.negative;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Step;
import uiTests.helpers.TestBaseExtended;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IncorrectPasswordLoginTests extends TestBaseExtended {
    @Test
    public void incorrectPasswordLoginTests() {

        step("Open the Main Page", () -> {
            open("https://www.visahq.com/");
        });
        step("Click the 'Sign In' Button", () -> {
            $(".sign_in-button").click();
        });
        step("Enter Login and Incorrect Password", () -> {
            $("#login").setValue("libertarianqa@gmail.com");
            $("#password").setValue("avadaKedavra");
            $("#register_login").click();
        });
        step("Verify the Error Message for Incorrect Password", () -> {
            $("#register_message_text").shouldHave(text("The password you are entering is incorrect."));
        });
    }
}