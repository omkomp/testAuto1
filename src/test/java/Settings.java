import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Settings {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;


    @BeforeAll
    static void registry() {

        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void init() {
        driver = new ChromeDriver();
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        driver.get("https://vavilon-kino.ru/");

    }


    @AfterEach
    public void driverClose() {
        driver.quit();
    }


}
