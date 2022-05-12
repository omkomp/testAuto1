import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class AfishaTest extends Settings {


    @Test
    public void openSite() {

        Assertions.assertTrue(driver.getCurrentUrl().contains("https://vavilon-kino.ru/"));
        driver.findElement(By.xpath("//img[@src=\"/upload/filmbase/posters/4218_sm_952.jpg\"]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div[8]/a")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[.='Выбор мест']")));
        Assertions.assertEquals(driver.findElement(By.xpath("//h1[.='Выбор мест']")).getText(),"Выбор мест");

    }

//driver.findElement(By.xpath("//h1[.='Выбор мест']")).getText()
}
