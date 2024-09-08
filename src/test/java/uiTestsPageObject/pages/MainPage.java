package uiTestsPageObject.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private RegisterPopup registerPopup = new RegisterPopup();
    private SelenideElement
            signInButton = $(".sign_in-button"),
            userName = $(".userName");

    public MainPage openPage() {
        open("https://www.visahq.com/");
        return this;
    }

    public RegisterPopup clickSignIn() {
        signInButton.click();
        return new RegisterPopup();
    }
    public MainPage verifyUserName(String value) {
        userName.shouldHave(text(value));
        return this;
    }
}
