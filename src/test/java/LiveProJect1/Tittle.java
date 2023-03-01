package LiveProJect1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tittle {
    @Test
    void loginTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/ ");
        driver.manage().window().maximize();
    }
}
