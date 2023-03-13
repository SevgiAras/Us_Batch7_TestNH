package day05;

import Utilities.ParameterDriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SearchFunctionalityWithFireFox extends ParameterDriverClass {
    @Test
    @Parameters(value = "searchKeyWord")
    void searchFunctionalityTest(String str) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


        WebElement searchBox = driver.findElement(By.cssSelector("input[type='text']"));

        searchBox.sendKeys(str);
        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();
        List<WebElement> resultList = driver.findElements(By.cssSelector("h4>a"));
        for (WebElement element : resultList) Assert.assertTrue(element.getText().toLowerCase().contains(str));

    }
}
