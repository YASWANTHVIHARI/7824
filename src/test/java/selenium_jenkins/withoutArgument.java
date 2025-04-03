package selenium_jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class withoutArgument {
	WebDriver driver;

    @BeforeTest
    public void setup() {
       
        //ChromeOptions options = new ChromeOptions();
      //  options.addArguments("--no-sandbox","--disable-dev-shm-usage","--headless"); 
        driver = new ChromeDriver();
        
        // Maximize browser window
        driver.manage().window().maximize();
    }

   
 
    @Test
    public void testIndiapost() {
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Close the browser after tests
        }
    }

}
