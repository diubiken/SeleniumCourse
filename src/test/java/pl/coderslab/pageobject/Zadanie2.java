package pl.coderslab.pageobject;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie2 {
    private WebDriver driver;

    @Test
    public void shouldLoginToNotifications() {
        this.driver.get("https://hotel-testlab.coderslab.pl/en/");
        PageObjectPattern1 mainPage = new PageObjectPattern1(driver);
        mainPage.signInInput();
        mainPage.loginRegisteredAccount();

    }

    @BeforeEach
    public void befeoreEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
    }
}
