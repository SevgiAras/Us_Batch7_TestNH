package day02;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_UpdateNameTest extends DriverClass {

    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * * Login
     * Click on Edit Account
     * Update name
     * Click on Continue
     * Verify the success message
     * Than update the name with the old name
     */


    @Test
    void updateNameTest() {

        updateName("sevgi");
        updateName("SevgiA");

    }


    public void updateName(String name) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

//        WebElement updateNAme=driver.findElement(By.name("email"));
//        updateNAme.sendKeys("kalaca@gmail.com");
//        WebElement updatePassword =driver.findElement(By.name("password"));
//        updatePassword.sendKeys("aassdd");
//        WebElement loginButton=driver.findElement(By.cssSelector("input[type='submit']"));
//        loginButton.click();

        WebElement editAccount = driver.findElement(By.xpath("//a[text()='Edit Account']"));
        editAccount.click();
        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys(name);
        WebElement continuee = driver.findElement(By.cssSelector("input[type='submit']"));
        continuee.click();

        WebElement successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertEquals(successMessage.getText(), "Success: Your account has been successfully updated.");


    }



}

