package pl.coderslab;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel3Test {
    @Test
    public void shouldSearchHotel() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInInput = driver.findElement(By.className("user_login"));
        signInInput.click();
        WebElement emailInput = driver.findElement(By.className("is_required"));
        emailInput.clear();
        emailInput.sendKeys("testbref@test.com");
        emailInput.submit();

 //       driver.quit();
    }
}
