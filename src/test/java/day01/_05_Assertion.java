package day01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Assertion {
    @Test
    void test() {
        String str = "john";
        String str2 = "john";

        //Checks if actual and expected are equal
        Assert.assertEquals(str, str2, "Test is not successful");

    }

    @Test
    void test2() {
        String str = "john";
        String str2 = "Snow";
        Assert.assertEquals(str, str2, "Test is not successful");

    }

    @Test
    void test3() {
        String str = "john";
        String str2 = "Snow";
        //checks if actual and expected are not equal
        Assert.assertNotEquals(str, str2, "test is not successful");
    }

    @Test
    void test4() {
        String str = "john";
        String str2 = "john";
        Assert.assertNotEquals(str, str2, "test is not successful");

    }

    @Test
    void test5() {
        int num1 = 45;
        int num2 = 45;

        Assert.assertTrue(num1 == num2, "test is not successful");
    }

    @Test
    void test6() {
        int num1 = 45;
        int num2 = 49;

        Assert.assertTrue(num1 == num2, "test is not successful");
    }

    @Test
    void test7() {

        String name = "john";
        Assert.assertNull(name, "Test is not successful");

    }

    @Test
    void test8() {
        Assert.fail("Test fails anyways");
    }
    @Test
    void test9() {
        String name="john";
        if (name.equals("john"))
        Assert.fail("Test fails anyways");
        //
    }
}
