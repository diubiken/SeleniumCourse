package pl.coderslab.Zadanie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.pageobject.PageObjectPattern1;

import java.time.Duration;

public class Zadanie1 {
    private WebDriver driver;

    @Test
    public void shouldLoginInAndFillIn() {
        this.driver.get("https://mystore-testlab.coderslab.pl/");
        PageObjectPattern mainPage = new PageObjectPattern(driver);
        mainPage.mystoreLoginInInput();
        mainPage.mystoreloginRegisteredAccount();
        mainPage.mystoreAddressesButton();
        mainPage.mystoreCreateNewAddressButton();
    }

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
    }
}
