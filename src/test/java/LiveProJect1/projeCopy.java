package LiveProJect1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class projeCopy {
    @Test
    void loginTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/menu ");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions action = new Actions(driver);
        WebElement mainItem = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        String beforeMainBoxColor=mainItem.getCssValue("background-color");
        System.out.println(beforeMainBoxColor);
        wait.until(ExpectedConditions.visibilityOf(mainItem));
        Action hoverOverMainItem = action.moveToElement(mainItem).build();
        hoverOverMainItem.perform();
        String afterMainBoxColor=mainItem.getCssValue(mainItem.getCssValue("background-color"));
        System.out.println(afterMainBoxColor);

        WebElement subList = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST')]"));
        String beforeSubListBoxColor=subList.getCssValue("background-color");
        System.out.println(beforeSubListBoxColor);
        Action hoverOverSubList = action.moveToElement(subList).build();
        hoverOverSubList.perform();
        String afterSubLIstBoxColor=subList.getCssValue(mainItem.getCssValue("background-color"));
        System.out.println(afterSubLIstBoxColor);
        Thread.sleep(5000);


        WebElement subItem1 = driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"));
        String beforeSubItemBoxColor=subItem1.getCssValue("background-color");
        System.out.println(beforeSubItemBoxColor);
        Action hoverOverSubItem1 = action.moveToElement(subItem1).build();
        action.click().build().perform();
        String afterSubItemBoxColor=subItem1.getCssValue(mainItem.getCssValue("background-color"));
        System.out.println(afterSubItemBoxColor);
        Thread.sleep(3000);
        subItem1.click();
        Thread.sleep(5000);
        Assert.assertEquals(subItem1.getText(), "Sub Sub Item 1");
        Thread.sleep(2000);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl.contains("Sub Sub Item 1"));





    }
}
