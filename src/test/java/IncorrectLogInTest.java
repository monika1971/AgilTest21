import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.prestashop.pages.authentication.AuthPage.alertMessage;
import static org.junit.jupiter.api.Assertions.*;

import static com.prestashop.pages.authentication.AuthPage.getAuthPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class IncorrectLogInTest extends BaseTestClass {
    TopMenu top = getTopMenu();
    AuthPage authPage = getAuthPage();
    public Label alert;

    @Test
    void testNoCorrectLogIn() {
        top.act()
                .selectSignInButton()
                .andThen()
                .verifyPageTitle("Login");
        authPage.act()
                .enterEmail("tolvan1@mail.com")
                .enterPassword("tolvan")
                .signIn();
        authPage.verify()
                .authenticationFailed();
    }

}


