package pop_MF;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

public class TestEditUserInformation extends EditUserInformation_MF {

    @Test
    public void changeUserAddress1(){
        clickOnSignInLink();
        email(Constant_MF.TEST_USER_EMAIL_1);
        password(Constant_MF.TEST_USER_PASSWORD_1);
        submitButton();
        clickOnAddressesLink();
        clickOnUpdateLink();
        changeAddress1("Testgatan 12");
        clickOnSaveButton();

        assertEquals("Address successfully updated!", driver.findElement(By.cssSelector("#notifications > div > article")).getText());
        //createANewAddress();

    }
}
