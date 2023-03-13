package day06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _06_SoftAssertVsHardAssert {


    @Test
    void hardAssertTest() {
        String str = "Hello";
        System.out.println("Before assertion");
        Assert.assertEquals("Hello World", str, "Your message is failed");//HArd Assertion
        //if actual is not the same with the expected it throws an exception and stops the code
        //Then TestNG will run next Test
        System.out.println("After assertion");
    }

    @Test
    void softAssertTest() {
        String strHomePAge="www.facebook.com/homepage";
        String strCartPAge="www.facebook.com/cartpage";
        String strEditAccount ="www.facebook.com/editaccountpage";

        SoftAssert softAssert =new SoftAssert();

        System.out.println("Before soft assert 1");
        softAssert.assertEquals("www.facebook.com/homepage", strHomePAge);
        System.out.println("After soft assert 1");

        System.out.println("Before soft assert 2");
        softAssert.assertEquals("www.facebook.com/profile", strCartPAge);
        System.out.println("After soft assert 2");

        System.out.println("Before soft assert 3");
        softAssert.assertEquals("www.facebook.com/setting", strEditAccount);
        System.out.println("After soft assert 3");

        softAssert.assertAll();
   }
}
