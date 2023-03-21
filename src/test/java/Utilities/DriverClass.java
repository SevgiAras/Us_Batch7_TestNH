package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

    public class DriverClass {


        public static WebDriver driver;

        public static WebDriverWait wait;

        @BeforeClass(alwaysRun = true)
        public void startingSettings() {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            wait = new WebDriverWait(driver,Duration.ofSeconds(30));
            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
           // login();
        }

//        void login() {
//           // driver.get("https://opencart.abstracta.us/index.php?route=account/login");
//            WebElement emailInput = driver.findElement(By.id("input-email"));
//            emailInput.sendKeys("testngusbatch@gmail.com");
//
//            WebElement password = driver.findElement(By.id("input-password"));
//            password.sendKeys("usbatch1234");
//
//            WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
//            loginButton.click();
//        }

        @AfterClass(alwaysRun = true)
        public void finishSettings(){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //driver.quit();
        }


    }
