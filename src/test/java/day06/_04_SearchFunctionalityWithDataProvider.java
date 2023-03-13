package day06;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class _04_SearchFunctionalityWithDataProvider extends DriverClass {
    /*
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Log in
     * search for mac, samsung, ipod by using data provider
     * Check all results contains these keywords
     * Use ParameterDriverClass
     */
    @Test(dataProvider = "searchKeywords")
    void searchFunctionalityTest(String str) throws InterruptedException {
        WebElement searchBox= driver.findElement(By.cssSelector("input[type='text']"));
        searchBox.clear();
        searchBox.sendKeys(str);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> resultList = driver.findElements(By.cssSelector("h4>a"));

        for (WebElement element: resultList){
            Assert.assertTrue(element.getText().toLowerCase().contains(str));
        }
        Thread.sleep(3000);
    }

    @DataProvider(name = "searchKeywords")
    public Object[][] searchData(){
        Object[][] dataList = {{"mac"},{"samsung"},{"ipod"}};
        return dataList;
    }

//    @Test
//    @Parameters(value = "searchKeyWord")
//    void  searchFunctionalityTest(String str) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//
//        WebElement searchBox = driver.findElement(By.cssSelector("input[type='text']"));
//        searchBox.clear();
//        searchBox.sendKeys(str);
//        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
//        searchButton.click();
//        List<WebElement> resultList = driver.findElements(By.cssSelector("h4>a"));
//        for (WebElement element : resultList) {
//            Assert.assertTrue(element.getText().toLowerCase().contains(str));
//        }
//        Thread.sleep(3000);
//
//
//    }
//    @DataProvider(name = "searchKeyWords")
//    public Object[][] searchData(){
//        Object[][]dataList={{"mav"},{"samsung"},{"ipod"}};
//
//        return dataList;
//
//    }
}
