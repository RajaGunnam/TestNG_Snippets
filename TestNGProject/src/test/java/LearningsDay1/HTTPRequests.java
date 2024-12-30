package LearningsDay1;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HTTPRequests {

   
    
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite: Initialize suite-level resources.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite: Cleanup suite-level resources.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test: Setup for <test> block.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test: Cleanup for <test> block.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class: Initialize class-level prerequisites.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class: Cleanup class-level resources.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method: Setup for individual test method.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method: Cleanup after test method.");
    }

    @Test
    public void testMethod1() {
        System.out.println("Executing Test Method 1.");
    }

    @Test
    public void testMethod2() {
        System.out.println("Executing Test Method 2.");
    }

    @Test(dataProvider = "testData")
    public void testWithDataProvider(String input) {
        System.out.println("Executing Test with DataProvider: Input = " + input);
    }

    @DataProvider(name = "testData")
    public Object[][] provideData() {
        return new Object[][] { {"Data1"}, {"Data2"}, {"Data3"} };
    }
    
}



