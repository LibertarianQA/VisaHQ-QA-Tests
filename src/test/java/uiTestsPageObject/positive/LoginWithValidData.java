package uiTestsPageObject.positive;


import uiTests.helpers.TestBaseExtended;
import org.junit.jupiter.api.Test;
import uiTestsPageObject.pages.MainPage;


public class LoginWithValidData extends TestBaseExtended {
    private MainPage mainPage = new MainPage();

    @Test

    public void loginWithValidData() {

        String login = "libertarianqa@gmail.com";
        String password = "LibertarianVisaHQ2024";
        String userName = "Nikolas";

        mainPage.openPage()
                .clickSignIn()
                .placeholderEmail(login)
                .placeholderPassword(password)
                .clickLogIn()
                .verifyUserName(userName);
    }
}
