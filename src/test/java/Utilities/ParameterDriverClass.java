package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class ParameterDriverClass {

//    public  WebDriver driver;
//    public static WebDriverWait wait;
//
//
//    @BeforeClass(alwaysRun = true)
//
//    @Parameters(value = "browser")
//    public void startingSetting(String browserName) {
//        if (browserName.equalsIgnoreCase("chrome")) {
//            driver = new ChromeDriver();
//        } else if (browserName.equalsIgnoreCase("firefox")) {
//            driver = new FirefoxDriver();
//        }
//        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        driver.manage().window().maximize();
//        login();
//    }
//
//    void login() {
//        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
//
//        WebElement updateNAme = driver.findElement(By.name("email"));
//        updateNAme.sendKeys("kalaca@gmail.com");
//        WebElement updatePassword = driver.findElement(By.name("password"));
//        updatePassword.sendKeys("aassdd");
//        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
//        loginButton.click();
//
//    }
//    @AfterClass(alwaysRun = true)
//    public void finishSetting() {
//        try {
//            Thread.sleep(3000);
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        // driver.quit();
//    }

    public WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    @Parameters(value = "browser")

    public void startingSettings(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }else if(browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }     //lse if (browserName.equalsIgnoreCase("safari"))
       //     driver=new SafariDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();

        login();
    }

    void login() {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement emailInput = driver.findElement(By.id("input-email"));
        emailInput.sendKeys("kalaca@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("aassdd");

        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        loginButton.click();
    }

    @AfterClass(alwaysRun = true)
    public void finishSettings(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
