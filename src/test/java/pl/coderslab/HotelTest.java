package pl.coderslab;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HotelTest {

    @Test
    public void shouldSearchHotel() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
        hotelLocationInput.clear();
        hotelLocationInput.sendKeys("Warsaw");
        WebElement newsletterEmailInput = driver.findElement(By.id("newsletter-input"));
        newsletterEmailInput.clear();
        newsletterEmailInput.sendKeys("test@test.com");
//        newsletterEmailInput.submit();
 //       driver.quit();
    }
    @Test
    public void shouldAddErrorBoarderToEmptyFormElements() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement submitButtom = driver.findElement(By.id("search_room_submit"));
        submitButtom.click();
        List<WebElement> newsletterEmailInput = driver.findElements(By.cssSelector("#search_hotel_block_form .error_border"));
    }
}
