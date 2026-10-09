package test.calculator_testing;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import test.automation_testing.iframehandle;

public class Search_Button {

	public static void main(String[] args) {
		
		Search_Button ob = new Search_Button();
		
		ob.searchbutton();
		
	}
	
	ChromeDriver driver = new ChromeDriver();
	
	void searchbutton() {
		
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("calcSearchTerm")).sendKeys("Math Calculators");
		
		driver.findElement(By.xpath("(//div[@id='calcSearchOut']/div)[1]/a")).click();
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.calculator.net/math-calculator.html";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Test Passed!!");
		}else {
			System.out.println("Test Failed!!");
		}
		
	}

}
