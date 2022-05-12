package ru;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Afisha {
    public  void login() {
        WebDriverManager.chromedriver().setup();
//System.setProperty("webdriver.chrome.driver","C:\\IdeaProjects\\afisha\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.afisha.ru/omsk/");

    }

}
