package pl.coderslab.Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectPattern {
    private WebDriver driver;

    public PageObjectPattern(WebDriver driver) {

        this.driver = driver;
    }

    public void mystoreLoginInInput() {
        WebElement mystoreLoginInInput = driver.findElement(By.id("_desktop_user_info"));
        mystoreLoginInInput.click();
        driver.manage().window().maximize();
    }
    public void mystoreloginRegisteredAccount() {
        WebElement RegisteredFirstNameInput = driver.findElement(By.name("email"));
        RegisteredFirstNameInput.clear();
        RegisteredFirstNameInput.sendKeys("michalmaniak@onet.pl");
        WebElement RegisteredPasswordInput = driver.findElement(By.name("password"));
        RegisteredPasswordInput.sendKeys("Maniak123");
        WebElement RegisteredSubmitInput = driver.findElement(By.id("submit-login"));
        RegisteredSubmitInput.click();

    }
    public void mystoreAddressesButton() {
        WebElement mystoreAddressessClickInput = driver.findElement(By.partialLinkText("Addresses"));
        mystoreAddressessClickInput.click();
    }
    public void mystoreCreateNewAddressButton() {
        WebElement mystoreAdressessClickInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/a"));
        mystoreAdressessClickInput.click();
    }
}
