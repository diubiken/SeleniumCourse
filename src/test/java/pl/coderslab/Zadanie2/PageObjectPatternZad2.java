package pl.coderslab.Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class PageObjectPatternZad2 {
    private WebDriver driver;
    int MyParametr = 5;

    public PageObjectPatternZad2(WebDriver driver) {

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

    public void mystoreClothesClick() {
        WebElement mystoreClothesClick = driver.findElement(By.xpath("//*[@id=\"category-3\"]/a"));
        mystoreClothesClick.click();

    }

    public void mystoreHummingbirdPrintedSweaterClick() {
        WebElement mystoreClothesClick = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a/img"));
        mystoreClothesClick.click();

    }

    public void mystoreSizeAndQuantityChoose() {
        WebElement mystoreClothesClick = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
        mystoreClothesClick.click();
        WebElement mystoreLSizeClick = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[3]\n"));
        mystoreLSizeClick.click();
        WebElement mystoreQuantityInput = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
        mystoreQuantityInput.sendKeys(String.valueOf(MyParametr));

    }
    public void mystoreAddToCard() {
        WebElement addToCard = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]"));
        addToCard.click();
    }

}
