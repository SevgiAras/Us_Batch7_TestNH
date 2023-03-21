package LiveProject3;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TC1 extends DriverClass {
    private int columns;

    @Test
    void signUp() throws InterruptedException, AWTException {


        driver.get("https://opensource-demo.orangehrmlive.com/");

        Actions actions=new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("admin123");
        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement adminButton =driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")));
        adminButton.click();

        WebElement addButton =driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        addButton.click();

        Thread.sleep(2000);
        WebElement ddmMnu = driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]"));
        ddmMnu.click();

        Thread.sleep(2000);
        List<WebElement> elements = driver.findElements(By.xpath("//div[@role='listbox']//child::*"));
        for(WebElement parcala : elements){
            System.out.println(parcala.getText());
        }
        elements.get(3).click();

       Thread.sleep(2000);
        WebElement menu2 = driver.findElement(By. xpath("(//div[@class='oxd-select-wrapper'])[2]"));
        menu2.click();
        List<WebElement> elements2 = driver.findElements(By.xpath("//div[@role='listbox']//child::*"));
        for(WebElement parcala : elements2){
            System.out.println(parcala.getText());
        }
        elements2.get(2).click();


        Thread.sleep(1000);
        WebElement epname = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        epname.click();

        epname.sendKeys("O");
        Thread.sleep(3000);
        WebElement epName= driver.findElement(By.xpath("//span[text()='Odis  Adalwin']"));
        Thread.sleep(2000);
        epName.click();


        WebElement usernameButton= driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        actions.moveToElement(usernameButton).click().sendKeys("GERRY").build().perform();
        WebElement passwordButton=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        actions.moveToElement(passwordButton).click().sendKeys("Gerry123.").build().perform();
        WebElement confirmPassword=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
        actions.moveToElement(confirmPassword).click().sendKeys("Gerry123.").build().perform();
        WebElement submitButton=driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(usernameButton.isDisplayed(), "GERRY");










    }


    }

