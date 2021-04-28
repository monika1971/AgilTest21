package pop_MF;

import org.openqa.selenium.By;

public class SignInPage_MF extends MenuBar_MF {

    //Login existing user
    public void email(String email){
        driver.findElement(By.name("email")).sendKeys(email);
    }

    public void password(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void clickShowPasswordButton () {
        driver.findElement(By.cssSelector("#login-form > section > div:nth-child(3)" +
                " > div.col-md-6 > div > span > button")).click();
    }

    public void submitButton() {
        BaseClass_MF.driver.findElement(By.id("submit-login")).click();
    }

    //CREATE A NEW USER ACCOUNT LINK
    public void createANewAccountLink () {
        driver.findElement(By.xpath("/html/body/main/section/div/div/" +
                "section/section/div/a")).click();
    }

    //SIGN OUT
    public void clickOnSignOutButton() {
        driver.findElement(By.cssSelector("#_desktop_user_info > div > a.logout.hidden-sm-down")).click();
    }
}

