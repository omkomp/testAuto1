package lesson8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginButton = $(By.xpath("//button[.='Войти']"));
    private SelenideElement enterWithPassword = $(By.xpath("//div[.='Войти с паролем']"));


    //@Step("Клик на кнопку авторизоваться")
    public LoginPage clickLoginButton() {
        loginButton.click();
        enterWithPassword.click();
        return this;
    }

    private SelenideElement login = $(By.xpath("//input[@autocomplete=\"username\"]"));
    private SelenideElement password = $(By.xpath("//input[@autocomplete=\"current-password\"]"));
    private SelenideElement clickLoginAuth = $(By.xpath("//div[@class=\"base-main-button\"]//div[.='Войти']"));


    public LoginPage login(String loginn) {
        login.sendKeys(loginn);
        return this;
    }

    public LoginPage password(String pass) {
        password.sendKeys(pass);
        return this;
    }

    public LoginPage clickAuthFinal() {
        clickLoginAuth.click();
        return this;
    }


    private SelenideElement chekSpell = $(By.xpath("//div[@data-code=\"8142276\"]//button[@class=\"button-ui button-ui_white button-ui_icon wishlist-btn\"]"));

    public LoginPage chekBox() throws InterruptedException {
        chekSpell.click();
        // Thread.sleep(6000);
        return this;
    }
private SelenideElement checkAddedToFavorites=$(By.xpath("//button[@class=\"button-ui buy-btn button-ui_brand\"]"));
    public LoginPage chekFavorites(){
        checkAddedToFavorites.shouldBe(Condition.visible);
        return this;
    }
}