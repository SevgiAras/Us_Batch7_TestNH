package day05;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class _02_SearchFunctionality  extends DriverClass {
    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Log in
     * Search for "mac"
     * Check if all results contains mac key word
     * */
    @Test
    @Parameters(value = "searchKeyWord")
    void  searchFunctionalityTest(String str) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        Thread.sleep(3000);
    WebElement searchBox= driver.findElement(By.cssSelector("#search>input"));
    searchBox.sendKeys(str);
    WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
    searchButton.click();
        List<WebElement> resultList=driver.findElements(By.cssSelector("h4>a"));
      for (WebElement element: resultList){
          Assert.assertTrue(element.getText().toLowerCase().contains(str));
      }
//    @Test
//    @Parameters(value = "searchKeyWord")
//    void searchFunctionalityTest(String str)  {
//        WebElement searchBox= driver.findElement(By.cssSelector("input[type='text']"));
//        searchBox.clear();
//        searchBox.sendKeys(str);
//
//        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
//        searchButton.click();
//
//        List<WebElement> resultList = driver.findElements(By.cssSelector("h4>a"));
//
//        for (WebElement element: resultList){
//            Assert.assertTrue(element.getText().toLowerCase().contains(str));
//        }

    }
}
