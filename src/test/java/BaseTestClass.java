import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class BaseTestClass {
    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeAll
    public static void setup() {
        driver = getDriver();
        wait = getWebDriverWait();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeEach
    public void init() {
        driver.get("http://40.76.27.113:8085/en/");
    }

    @AfterEach
    public void cleanUp() {
        driver.get("http://40.76.27.113:8085/en/?mylogout=");
    }

    @AfterAll
    public static void tearDown() {
        //driver.quit();
    }

}
