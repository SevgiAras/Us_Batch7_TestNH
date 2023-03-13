package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_SignUpTest {
    /*
     * Go to "https ://opencart.abstracta.us/index.php?route=account/login"
     * click on my account
     * click on Register
     * Fill int hr form with valid information
     * Accept the agreement
     * Click on the continue
     * Click on continue button
     * verify that you are
     */

    @Test
    void signUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement myAccount = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccount.click();

        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();

        WebElement name = driver.findElement(By.id("input-firstname"));
        name.sendKeys("John");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Snow");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("kalaca@gmail.com");

        WebElement phone = driver.findElement(By.id("input-telephone"));
        phone.sendKeys("123409890");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("aassdd");

        WebElement passwordConfirm = driver.findElement(By.id("input-confirm"));
        passwordConfirm.sendKeys("aassdd");

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
        continueButton.click();

        WebElement successMessage = driver.findElement(By.xpath("//div[@id='content']//p"));

        Assert.assertEquals(successMessage.getText(), "Congratulations! Your new account has been successfully created!", "the test is not successful");

        Thread.sleep(3000);


        driver.quit();

    }
}
