package day07;

import Utilities.DriverClass;
import Utilities.ParameterDriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class _01_PlaceOrderFunctionality  extends DriverClass {


    @Test(dataProvider = "getData")
    void  checkOutTest(String searchKeyWord) throws InterruptedException {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='search']"));
        searchBox.sendKeys(searchKeyWord);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class=\"btn btn-default btn-lg\"]"));
        searchButton.click();
        Thread.sleep(3000);
      // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add to Cart']")));
        WebElement addToCartButton = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        Thread.sleep(3000);
        addToCartButton.click();

        WebElement cartTotal = driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
        cartTotal.click();

        WebElement checkOutButton = driver.findElement(By.linkText("Checkout"));
        checkOutButton.click();

        WebElement continueAddress = driver.findElement(By.id("button-payment-address"));
        continueAddress.click();

        WebElement continueShippingAddress = driver.findElement(By.id("button-shipping-address"));
        continueShippingAddress.click();

        WebElement continueShippingMethod = driver.findElement(By.id("button-shipping-method"));
        continueShippingMethod.click();

        WebElement paymentRadioButton = driver.findElement(By.cssSelector("input[type='checkbox'"));
        paymentRadioButton.click();

        WebElement paymentContinue = driver.findElement(By.id("button-payment-method"));
        paymentContinue.click();

        WebElement confirmOrderButton = driver.findElement(By.id("button-confirm"));
        confirmOrderButton.click();

        WebElement successMessage = driver.findElement(By.xpath("//div[@id='content']/h1[text()='Your order has been placed!']"));
        Assert.assertTrue(successMessage.getText().equals("Your order has been placed!"));

    }
   @DataProvider

    public Object[][] getData(){
        Object[][] myData={{"ipad"}};
        return myData;


    }


}
