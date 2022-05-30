package javaDns;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DnsTest {
    WebDriver driver;
    String orders;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void registry() {
        driver=new ChromeDriver();
        driver.get("https://www.dns-shop.ru/?city=omsk");

    }

    @Test
//    @Description("Авторизация на сайте днс")
//    @Story("печеньки")

    void loginTest() throws InterruptedException {
     javaDns.LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton().login("luckyjr777@mail.ru").password("110275vvv").clickAuthFinal();
       // Thread.sleep(9000);
        loginPage.bButton();
        Thread.sleep(9000);

      //  orders =driver.findElement(By.xpath("//span[.='Корзина']")).getText();
       // Assertions.assertEquals("Корзина",  orders);

//        loginPage.loginCooki();
//        loginPage.clickAuthFinal().chekBox();

    }

    @AfterEach()
    void exit() throws InterruptedException {
        Thread.sleep(5000);
      //  LogEntries logEntries= driver.manage().logs().get(LogType.BROWSER);

        driver.quit();
    }






}
