package pop_MF;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass_MF extends Constant_MF {
    static WebDriver driver;
    static WebDriverWait wait;
    public WebElement facebookIconButton;
    public WebElement instagramIconButton;
    static JavascriptExecutor js;




    //FILL IN FORM CREATE NEW ADDRESS



    @BeforeAll
    public static void constant() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get(Constant_MF.URL);
        js = (JavascriptExecutor) driver;

    }

    @BeforeEach
    public void setUp(){
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 200);

        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }

    @AfterAll
    public static void tearDownAfterAll() {
        //driver.quit();
    }
}

