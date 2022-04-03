package pl.coderslab.Zadanie1;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillNewAddressForm {
    private WebDriver driver;

    @Given("^Page opened in browser%")
    public void pageOpenInBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=address");
    }
//    When "Mr" is entered in Alias box
//    And "Opolska 123" is entered in Address box
//    And "40-568" is entered in Zip/Postal Code box
//    And "Katowice" is entered in City box
//    And "United Kingdom" is selected in Country box
//    And "+48500001002" is entered in Phone box
//    And "SAVE" button is clicked
//    Then Address is added and "Address successfully added!" is shown
    }
