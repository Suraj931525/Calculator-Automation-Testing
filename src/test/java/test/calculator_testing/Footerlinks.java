package test.calculator_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Footerlinks {
	
	ChromeDriver driver;
	
	@BeforeTest
	void launchbrowser() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.calculator.net/");
		
		driver.manage().window().maximize();
	}
	
	
	@Test
	void aboutus() {
		
		driver.get("https://www.calculator.net/");
		
		driver.findElement(By.xpath("(//div[@id='footernav']/a)[1]")).click();
		
	}
	
	@Test
	void sitemap() {
		
		driver.get("https://www.calculator.net/");
		
		driver.findElement(By.xpath("(//div[@id='footernav']/a)[2]")).click();
		
	}
	
	@Test
	void termofuse() {
		
		driver.get("https://www.calculator.net/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@id='footernav']/a)[3]")).click();
		
	}
	
	@Test
	void privacypolicy() {
		
		driver.get("https://www.calculator.net/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@id='footernav']/a)[4]")).click();
		
		
	}
	
	@AfterTest
	void closeBrowser() {

	    driver.quit();
	}

}
