package lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VavilonTest {
    WebDriver driver;

    @BeforeAll
    static void init() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void registry() {
        driver = new ChromeDriver();
        driver.get("https://vavilon-kino.ru/");
    }

    @Test
    void testVavilon() throws InterruptedException {
     //   LoginPage loginPage = new LoginPage(driver);
//        loginPage.clickInput.click();
//        loginPage.loginInput.sendKeys("luckyjr777@mail.ru");
//        loginPage.passwordInput.sendKeys("111111");
//        loginPage.loginClick.click();
//        Thread.sleep(3000);
//        loginPage.filmBase.click();
//        Thread.sleep(2000);

//        loginPage.filmClick.click();

      new LoginPage(driver).clickAuth().loginInputS().passwordInputS().clickLoginButton().showAllFilms().selectFilm();
        Assertions.assertEquals(driver.findElement(By.xpath("//h1[.='Выбор мест']")).getText(),"Выбор мест");
       // Assertions.assertEquals(driver.findElement(By.xpath("//a[.='Белль и Себастьян (6+)']")).getText(),"Белль и Себастьян (6+)");


      //  Thread.sleep(5000);
    }


    @AfterEach
    void killDriver() {
        driver.quit();
    }
}

