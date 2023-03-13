package day06;

import Utilities.ParameterDriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _07_PLaceOrderFunctionality extends ParameterDriverClass {
    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Log in
     * Search for ipod
     * Add the first result to cart
     * Click on cart icon
     * Click on Check Out
     * Fill the form
     * Click on Confirm and verify that your order is successful
     * */
    //@Parameters(value = "searchKeyWord")
           @Test
            void  checkOutTest(String searchKeyWord){


               WebElement searchBox = driver.findElement(By.cssSelector("input[name='search']"));
        searchBox.sendKeys(searchKeyWord);

    WebElement searchButton = driver.findElement(By.cssSelector("button[class=\"btn btn-default btn-lg\"]"));
        searchButton.click();

    WebElement addToCartButton = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
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

}
