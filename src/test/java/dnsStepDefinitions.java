import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lesson8.LoginPage;

public class dnsStepDefinitions {
    @Given("^Пользователь авторизован на сайте$")
    public void userAuthorized() {
        Selenide.open("https://www.dns-shop.ru/?city=omsk");
        new LoginPage()
                .clickLoginButton()
                .login("luckyjr777@mail.ru")
                .password("110275vvv")
                .clickAuthFinal();
    }

    @When("^пользователь кликает в избранное товар$")
    public void userClikingOnFaforites() throws InterruptedException {
        new LoginPage()
                .chekBox();
    }

//    @Then("^пользователь видит товар в избранном$")
//    public void userLooksFavorites() {
//        new LoginPage().chekFavorites();
//    }
}
