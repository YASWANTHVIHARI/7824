package selenjenk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumjenkinss {
	WebDriver driver= new ChromeDriver();
	@Test
	public void google() throws Exception{
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.name("q")).sendKeys("Indiapost",Keys.ENTER);
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
	driver.quit();
	}
	

    @Test
    public void testGoogle() {
        driver.get("https://www.facebook.com/");
      
        System.out.println("Title: " + driver.getTitle());
      
        
    }
    
    @Test
    public void testindiapost() {
        driver.get("https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
      
        System.out.println("Title: " + driver.getTitle());
      
        
    }

}
