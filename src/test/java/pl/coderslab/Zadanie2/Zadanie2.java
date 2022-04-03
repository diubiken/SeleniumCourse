package pl.coderslab.Zadanie2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.Zadanie1.PageObjectPattern;

import java.time.Duration;

public class Zadanie2 {
    private WebDriver driver;

    @Test
    public void shouldLoginInAndFillIn() {
        this.driver.get("https://mystore-testlab.coderslab.pl/");
        PageObjectPatternZad2 mainPage = new PageObjectPatternZad2(driver);
        mainPage.mystoreLoginInInput();
        mainPage.mystoreloginRegisteredAccount();
        mainPage.mystoreClothesClick();
        mainPage.mystoreHummingbirdPrintedSweaterClick();
        mainPage.mystoreSizeAndQuantityChoose();
        mainPage.mystoreAddToCard();
    }

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
    }
}
