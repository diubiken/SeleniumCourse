package pl.coderslab.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectPattern1 {
    private WebDriver driver;

    public PageObjectPattern1(WebDriver driver) {
        this.driver = driver;
    }

    public void signInInput() {
        WebElement signInInput = driver.findElement(By.className("user_login"));
        signInInput.click();
    }

    public void createAnAccount() {
        WebElement EmailAdressInput = driver.findElement(By.id("email_create"));
        EmailAdressInput.clear();
        EmailAdressInput.sendKeys("test123bingo111@test.com");
        WebElement hotelSubmitInput = driver.findElement(By.id("SubmitCreate"));
        hotelSubmitInput.click();
    }

    public void registerAccount() {
        WebElement GenderInput = driver.findElement(By.id("id_gender1"));
        GenderInput.click();
        WebElement PersonalInformationFirstNameInput = driver.findElement(By.id("customer_firstname"));
        PersonalInformationFirstNameInput.clear();
        PersonalInformationFirstNameInput.sendKeys("Michal");
        WebElement personalInformationLastNameInput = driver.findElement(By.id("customer_lastname"));
        personalInformationLastNameInput.clear();
        personalInformationLastNameInput.sendKeys("Maniak");
        WebElement personalInformationPasswordInput = driver.findElement(By.id("passwd"));
        personalInformationPasswordInput.clear();
        personalInformationPasswordInput.sendKeys("maniak123");
        WebElement personalInformationSubmitInput = driver.findElement(By.id("submitAccount"));
        personalInformationSubmitInput.click();
    }
    public void loginRegisteredAccount() {
        WebElement RegisteredFirstNameInput = driver.findElement(By.id("email"));
        RegisteredFirstNameInput.clear();
        RegisteredFirstNameInput.sendKeys("test123bingo111@test.com");
        WebElement RegisteredPasswordInput = driver.findElement(By.id("passwd"));
        RegisteredPasswordInput.sendKeys("maniak123");
        WebElement RegisteredSubmitInput = driver.findElement(By.id("SubmitLogin"));
        RegisteredSubmitInput.click();

    }
}

