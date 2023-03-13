package day07;

import Utilities.DriverClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_PlaceOrderPOM extends DriverClass {

    @Test
    void checkout() throws InterruptedException {
        _02_PlaceOrderFunctionalityElements elements= new _02_PlaceOrderFunctionalityElements();

        elements.searchBox.sendKeys("ipod");
        elements.searchButton.click();
        elements.addCartButton.click();
        Thread.sleep(2000);
        //elements.cartButton.click();
        Thread.sleep(2000);
        elements.checkoutButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continueAddress));
        Thread.sleep(2000);
        elements.continueAddress.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continueShippingAddress));
        elements.continueShippingAddress.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continueShippingMethod));
        elements.continueShippingMethod.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.paymentRadioButton));
        elements.paymentRadioButton.click();

        elements.paymentContinue.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.confirmOrderButton));
        elements.confirmOrderButton.click();


        wait.until(ExpectedConditions.visibilityOf(elements.successMessage));
        Assert.assertTrue(elements.successMessage.getText().equals("Your order has been placed!"));


    }
}
