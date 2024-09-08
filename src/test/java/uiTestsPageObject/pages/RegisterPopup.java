package uiTestsPageObject.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPopup {

    private SelenideElement
            login = $("#login"),
            password = $("#password"),
            logInButton = $("#register_login");

    public RegisterPopup getRegisterPopup() {
        return new RegisterPopup();
    }

    public RegisterPopup placeholderEmail(String value) {
        login.setValue(value);
        return this;
    }

    public RegisterPopup placeholderPassword(String value) {
        password.setValue(value);
        return this;
    }

    public MainPage clickLogIn() {
        logInButton.click();
        return new MainPage();
    }
}
