import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Practice_Sesion {

    @Test
    public void openAhexWebsite() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://ahex.co/");
        
        // Maximize the window
        driver.manage().window().maximize();
        
        String pagetitle = driver.getTitle();
        System.out.println("Page title is: " + pagetitle);
        
        String expectedPageTitle = "Ahex : Web and Mobile App Development Company India, USA";
        
        // Hard assertion to check page title
        AssertJUnit.assertEquals(pagetitle, expectedPageTitle, 
                            "The page title does not match the expected title.");
        
        // If assertion passes, you can add a success message
        System.out.println("Hard Assertion passed: The page title matches the expected title.");

          
        
        //Soft assertions to check page title
        
        SoftAssert softAssertions = new SoftAssert();
        AssertJUnit.assertEquals(pagetitle, expectedPageTitle, "The page title does not match the expected title.");
        softAssertions.assertAll();
        System.out.println("Soft Assertion passed: The page title matches the expected title.");
        
        
        driver.quit();
        
        
        
    }
}
