package pop_MF;

import org.openqa.selenium.By;


public class MenuBar_MF extends BaseClass_MF {

    public void clickOnSignInLink() {
        driver.findElement(By.cssSelector("#_desktop_user_info > div > a")).click();
    }
    public void clickOnClothesLink() {
        driver.findElement(By.id("category-3")).click();
    }

    public void clickOnSignOutButton(){
        driver.findElement(By.cssSelector("#_desktop_user_info > div > a.logout.hidden-sm-down")).click();
    }
}
