package test.calculator_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Operatorstest {
	
	ChromeDriver driver;
	
	
	@BeforeTest
    void startBrowser() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.calculator.net/");
    }
	
	@Test
	void addition() {
		
		driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
		
	}
	
	
	@Test
	void substraction() {
		
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		
	}

	@Test
	void multiplication() {
	
	driver.get("https://www.calculator.net/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
	driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	
}


	@Test
	void division() {
	
	driver.get("https://www.calculator.net/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
	

}
	
	@AfterTest
    void closeBrowser() {

        driver.quit();
    }

}
