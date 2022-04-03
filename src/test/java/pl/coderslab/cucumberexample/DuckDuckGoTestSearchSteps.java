package pl.coderslab.cucumberexample;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Locale;


public class DuckDuckGoTestSearchSteps {
    private WebDriver driver;

    @Given("^Page https://duckduckgo.com/ opened in browser$")
    public void pageOpenedInBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://duckduckgo.com/");
    }
//        searchInputBox.submit();

    @When("^Search phrase entered in search input box$")
    public void searchPhrase() {
        WebElement searchInputBox = driver.findElement(By.id("search_form_input_homepage"));
        searchInputBox.clear();
        searchInputBox.sendKeys("Adele");
    }

    @And("^Clicked \"search button\"$")
    public void pressedEnterInSearchInput() {
        WebElement searchInputBox = driver.findElement(By.id("search_form_input_homepage"));
        searchInputBox.sendKeys(Keys.ENTER);
    }

    @Then("^First 3 search results contain phrase \"Adele\"$")
    public void firstResultsContainPhrase() {
        List<WebElement> searchResultsLink = driver.findElements(By.className("result__a"));
        final String requiredPhrase = "Adele";
        for (int i = 0; i < 3; i++) {
            String linkText = searchResultsLink.get(i).getText();
            if (!linkText.toLowerCase()
                    .contains(requiredPhrase.toLowerCase())){
                Assert.fail(String.format("Result shold contain (case insensitive): %s, but was %s", requiredPhrase, linkText));
            }
        }
    }

}


