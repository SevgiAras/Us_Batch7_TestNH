package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_Example {
    /*
    "https://opencart.abstracta.us/index.php?route=account/login page
    *login
    *email:testngusbatch@gmail.com
    *password :usbatch1234
    *verify that you see My account
    */
    @Test
    void loginTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        driver.manage().window().maximize();
        WebElement emailButton = driver.findElement(By.xpath("//input[@name='email']"));
        emailButton.sendKeys("testngusbatch@gmail.com");
        WebElement passwordButton = driver.findElement(By.xpath("//input[@name='password']"));
        passwordButton.sendKeys("usbatch1234");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        WebElement myAccountHeader = driver.findElement(By.xpath("(//div[@id='content']//h2)[1]"));
//
//     if (myAccountHeader.isDisplayed()){
//         System.out.println(myAccountHeader.getText().equals("my Account"));
//     }

        Assert.assertEquals(myAccountHeader.getText(), "My Account");
        Thread.sleep(3000);
        driver.quit();
    }
}
