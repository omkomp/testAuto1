package lesson61;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

public class AfishaTest {
    WebDriver driver;
    String orders;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void registry(){
        driver=new ChromeDriver();
        driver.get("https://www.dns-shop.ru/?city=omsk");
    }

    @Test
    @Description("Авторизация на сайте днс")
    @Story("печеньки")

    void loginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
       // loginPage.clickLoginButton().login().password().clickAuthFinal();

       orders =driver.findElement(By.xpath("//span[.='Корзина']")).getText();
        Assertions.assertEquals("Корзина",  orders);

        loginPage.loginCooki();
        loginPage.clickAuthFinal().chekBox();

    }

    @AfterEach()
        void exit() throws InterruptedException {
            Thread.sleep(15000);
          LogEntries logEntries= driver.manage().logs().get(LogType.BROWSER);

            driver.quit();
        }

}
