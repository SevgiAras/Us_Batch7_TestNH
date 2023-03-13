package day07;

import Utilities.ParameterDriverClass;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _04_WishlistTest extends ParameterDriverClass {
    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Log in
     * search for ipod (send"ipod"from xml file
     * add one of the elements to the wish list randomly
     * click on Wish list button
     * Check if the name of the element is the same with the name of element you added
     * use POM and ParameterDriver
     * perform non-parallel cross browser test
     * **/

//    @Test
//    @Parameters(value = "searchKeyword")
//    void wishListTest(String searchWord){
//        //_02_PlaceOrderFunctionalityElements elements=new _02_PlaceOrderFunctionalityElements();
//        _05_WishListElements wishListElements=new _05_WishListElements(driver);
//
//        wishListElements.getSearchBox().sendKeys(searchWord);
//        wishListElements.getSearchButton().click();
//
//        int randomIndex =(int) (Math.random()*wishListElements.getProductsList().size());
//        String productName = wishListElements.getProductNameLIst().get(randomIndex).getText();
//        wishListElements.getProductsList().get(randomIndex).click();
//       wishListElements.getWishListButton().click();
//        Assert.assertEquals(wishListElements.getWishListProduct().getText(),productName);
//        wishListElements.getRemoveButton().click();

//    @Test
//    @Parameters(value = "searchKeyword")
//    void wishListTest(String searchWord){
//
//        _05_WishListElements wishListElements = new _05_WishListElements(driver);
//
//        wishListElements.getSearchBox().sendKeys(searchWord);
//        wishListElements.getSearchButton().click();
//
//        int randomIndex = (int)(Math.random()*wishListElements.getProductsList().size());
//        String productName = wishListElements.getProductNameLIst().get(randomIndex).getText();
//        wishListElements.getProductsList().get(randomIndex).click();
//
//        wishListElements.getWishListButton().click();
//
//        Assert.assertEquals(wishListElements.getWishListProduct().getText(),productName);
//
//        wishListElements.getRemoveButton().click();
    @Test
    @Parameters(value = "searchKeyword")
    void wishListTest(String searchWord){

        _05_WishListElements wishListElements = new _05_WishListElements(driver);

        wishListElements.getSearchBox().sendKeys(searchWord);
        wishListElements.getSearchButton().click();

        int randomIndex = (int)(Math.random()*wishListElements.getProductsList().size());
        String productName = wishListElements.getProductNameList().get(randomIndex).getText();
        wishListElements.getProductsList().get(randomIndex).click();

        wishListElements.getWishListButton().click();

       // Assert.assertEquals(wishListElements.getWishListProduct().getText(),productName);

        wishListElements.getRemoveFromWishListButton().click();
    }

    }

