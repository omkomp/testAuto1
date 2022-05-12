import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends Settings{
   private void login(){
        driver.findElement(By.xpath("//a[.='Войти']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Авторизация']")));
        driver.findElement(By.xpath("//input[@name=\"login\"]")).sendKeys("luckyjr777@mail.ru");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("111111");
        driver.findElement(By.xpath("//button[.='Войти']")).click();
    }
}
