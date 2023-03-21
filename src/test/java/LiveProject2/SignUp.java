package LiveProject2;

import Utilities.DriverClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class SignUp extends DriverClass {
    @Test
    void signUp() throws InterruptedException, AWTException {
       // WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://opensource-demo.orangehrmlive.com/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("admin123");
        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

//        WebElement myInfo = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[6]"));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='oxd-main-menu-item'])[6]")));
//        myInfo.click();
//        WebElement employeeFullName = driver.findElement(By.xpath("//label[text()='Employee Full Name']"));
//        driver.findElement(By.xpath("//input[@name='firstName']"));
//        Thread.sleep(3000);
//        Actions actions = new Actions(driver);
//        actions.click(driver.findElement(By.xpath("//input[@name='firstName']"))).keyDown(Keys.CONTROL).sendKeys("a").
//                keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys("Tom").build().perform();
//
//        WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit']"));
//        Thread.sleep(2000);
//        saveButton.click();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//
//
//        WebElement pictureButton=driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-image']"));
//        pictureButton.click();
//        WebElement employeeImage =driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']"));
//        employeeImage.click();
//        Thread.sleep(2000);
//
//        Robot robot=new Robot();
//        Thread.sleep(3000);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        StringSelection ss =new StringSelection("\"C:\\Users\\user\\OneDrive\\Desktop\\HRMpicture.jpg\"");
//
//        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
//        clipboard.setContents(ss,ss);
//        Thread.sleep(2000);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_V);
//        Thread.sleep(2000);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        Thread.sleep(1000);
//        robot.keyRelease(KeyEvent.VK_V);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        Thread.sleep(1000);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        WebElement saveButton2 = driver.findElement(By.xpath("//button[@type='submit']"));
//        Thread.sleep(2000);
//        saveButton2.click();
//
//        driver.navigate().refresh();
//
//
//
//
//






/*
        Robot robot=new Robot();


        for (int i = 0; i <21 ; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            wait(1);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        StringSelection stringSelection =new StringSelection("\"C:\\Users\\user\\OneDrive\\Desktop\\A list Of will do\"");

        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,stringSelection);
        wait(2);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        wait(1);

        WebElement checkBox = driver.findElement(By.className("field_check"));
        checkBox.click();

        WebElement submitButton= driver.findElement(By.id("submitbutton"));
        submitButton.click();

        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement successMessage= driver.findElement(By.id("res"));

        wait.until(ExpectedConditions.visibilityOf(successMessage));



        System.out.println(successMessage.getText().contains("successfully")); */

    }

        //        Assert.assertEquals("Tom", "Tom");
//        System.out.println("actual name ==>Tom");


    }

