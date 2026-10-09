package test.calculator_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search_Buttontest {
	
ChromeDriver driver;
	

	@Test
	void searchbutton() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("calcSearchTerm")).sendKeys("Math Calculators");
		
		driver.findElement(By.xpath("(//div[@id='calcSearchOut']/div)[1]/a")).click();
		
	}

}
