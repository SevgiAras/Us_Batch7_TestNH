package day01;

import org.testng.annotations.Test;

public class _01_Intro {
    // public static void main(String[] args) {
    //go to page
    //login
    //add to cart
    //check out
    //}
// if you don't give the order it runs the tests in alphabetical order
    @Test(priority = 1)
    public void loginTest() {
        System.out.println("Login test is successful");
    }

    @Test(priority = 2)//second test to be run
    public void addCartTest() {

        System.out.println("Add to cart test is successful");
    }

    @Test(priority = 3)//third test to be run
    public void checkOut() {
        System.out.println("CheckOut test is successful");
        //

    }
}
