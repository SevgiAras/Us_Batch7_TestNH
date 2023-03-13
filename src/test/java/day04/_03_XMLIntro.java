package day04;

import org.testng.annotations.*;

public class _03_XMLIntro {
    /*
    @BeforeSuit // it is cover everything. it is only one.
     @BeforeTest
       @beforeGroup
         @BeforeClass //runs before every classannotation
           @BeforeMethod// runs before every @Test annotation
             @Test1 method // we write our tests
             @Test2 method
            @AfterMethod // runs after every @Test annotation
           @AfterClass  // runs after every class annotation
          @AfterGroup
         @AfterTest
        @AfterSuit

      */
    @BeforeSuite
    void beforeSuitMethod() {
        System.out.println("before suit runs");

    }

    @BeforeTest
    void beforeTestMethod() {
        System.out.println("before Test  runs");
    }

    @BeforeClass
    void beforeClassMethod() {
        System.out.println("before class runs");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("before method runs");

    }

    @Test
    void test1() {
        System.out.println("Test 1 run ");
    }

    @Test
    void test2() {
        System.out.println("Test 2 run ");
    }

    @AfterMethod
    void afterMethodMethod() {
        System.out.println("after method runs");
    }

    @AfterClass
    void afterClassMethod() {
        System.out.println("after Class runs");
    }

    @AfterGroups
    void afterGroups() {
        System.out.println("after groups runs");
    }

    @AfterTest
    void afterTestMethod() {
        System.out.println("after test runs");
    }

    @AfterSuite
    void afterSuitMethod() {
        System.out.println("after Suit runs");

    }
}
