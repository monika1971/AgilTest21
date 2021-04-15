package com.prestashop.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private DriverFactory() {
        //prevent instantiation
    }


    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\bin\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriverWait getWebDriverWait() {
        if (wait == null) {
            wait = new WebDriverWait(getDriver(), 5);
        }
        return wait;
    }

}
