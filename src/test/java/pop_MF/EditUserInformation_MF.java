package pop_MF;

import org.openqa.selenium.By;

public class EditUserInformation_MF extends SignInPage_MF {

    //EDIT ADDRESS
    public void clickOnAddressesLink(){
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/a[2]")).click();
    }

    //CLICK UPDATE BUTTON
    public void clickOnUpdateLink(){
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/" +
                "article/div[2]/a[1]/span")).click();
    }
    //CHANGE ADDRESS1
    public void changeAddress1(String address1){
        driver.findElement(By.name("address1")).clear();
        driver.findElement(By.name("address1")).sendKeys(address1);
    }

    //CLICK ON SAVE BUTTON
    public void clickOnSaveButton(){
        driver.findElement(By.cssSelector("#content > div > div > form > footer > button")).click();
    }

    //CREATE A NEW ADDRESS
    public void createANewAddress(){
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[3]/a")).click();
    }
}
