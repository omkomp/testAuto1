import Lesson8TestAli.LoginPage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class aliStepDefinitions {
    @Given("get authorisation on aliexpress")
    public void getAuthorisationOnAliexpress() {
        Selenide.open("https://aliexpress.ru/");
        new LoginPage().authorization("luckyjr777@mail.ru", "110275vm");
    }

    @When("adds favorites to goods")
    public void addsFavoritesToGoods() {
        new LoginPage().addCart();

    }

    @Then("check added favorites")
    public void checkAddedFavorites() {
        new LoginPage().checkOrder();
    }
}
