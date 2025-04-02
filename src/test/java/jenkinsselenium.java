import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jenkinsselenium {
	@Test
	public void google() throws Exception{

	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.name("q")).sendKeys("Indiapost",Keys.ENTER);
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
	driver.quit();
	}

}
