package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        actions = new Actions(driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[.='Войти']")
    public WebElement clickInput;

    @FindBy(xpath = "//input[@name=\"login\"]")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Войти']")
    public WebElement loginClick;

    @FindBy(xpath = "//div[@class=\"img\"]/img[@src=\"/upload/filmbase/posters/4228_sm_8464.jpg\"]")
    public WebElement filmBase;

    @FindBy(xpath = "//div[@class=\"trailer\"]/../div[@class=\"desc-container sub-popup\"]//a[contains(.,'билет')]")
    public WebElement filmClick;

    public LoginPage clickAuth(){
        clickInput.click();
        return this;
    }

    public LoginPage loginInputS(){
        loginInput.sendKeys("luckyjr777@mail.ru");
        return this;
    }

    public LoginPage passwordInputS(){
        passwordInput.sendKeys("111111");
        return this;
    }

    public LoginPage clickLoginButton() throws InterruptedException {
        loginClick.click();
     //   Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-video-hq=\"https://mediaserver.etobilet.ru/upload/movie/trailer/mp4/720__original_filename_4463_6794_hq.mp4\"]/ancestor::li/div[@class=\"title\"]/a[contains(.,'чудище')]")));
        return this;
    }

    public LoginPage showAllFilms(){
        filmBase.click();
        return this;
    }

    public void selectFilm() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"trailer\"]/../div[@class=\"desc-container sub-popup\"]//a[contains(.,'билет')]")));

        filmClick.click();
        Thread.sleep(5000);
       // return this;
    }
}
