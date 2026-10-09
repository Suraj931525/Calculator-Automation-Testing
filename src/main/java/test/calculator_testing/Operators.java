package test.calculator_testing;

import java.awt.Dialog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import test.automation_testing.iframehandle;

public class Operators {

	public static void main(String[] args) {
		
		Operators ob = new Operators();
		
		ob.startBrowser();
		System.out.println("--------------------Addition Test-----------------------");
		ob.addition();
		System.out.println("--------------------Substraction Test-----------------------");
		ob.substraction();
		System.out.println("--------------------Multiplication Test-----------------------");
		ob.multiplication();
		System.out.println("--------------------Division Test-----------------------");
		ob.division();
		ob.closeBrowser();
		

	}
	
	ChromeDriver driver = new ChromeDriver();
	WebElement outputElement;
	String Actualoutput;
	String Expectedoutput;
	
    void startBrowser() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.calculator.net/");
    }
    
    void closeBrowser() {

        driver.quit();
    }
	
	void addition() {
		
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
		
		outputElement = driver.findElement(By.id("sciOutPut"));
		
		Actualoutput = outputElement.getText();
		Expectedoutput = " 100";
		
		if(Actualoutput.equals(Expectedoutput)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
	}
	
	
void substraction() {
		
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		
		outputElement = driver.findElement(By.id("sciOutPut"));
		
		Actualoutput = outputElement.getText();
		Expectedoutput = " 25";
		
		if(Actualoutput.equals(Expectedoutput)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
	}

void multiplication() {
	
	driver.get("https://www.calculator.net/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
	driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	
	
	outputElement = driver.findElement(By.id("sciOutPut"));
	
	Actualoutput = outputElement.getText();
	Expectedoutput = " 250";
	
	if(Actualoutput.equals(Expectedoutput)) {
		System.out.println("Test Passed!");
	}else {
		System.out.println("Test Failed!");
	}
	
}


void division() {
	
	driver.get("https://www.calculator.net/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
	
	outputElement = driver.findElement(By.id("sciOutPut"));
	
	Actualoutput = outputElement.getText();
	Expectedoutput = " 25";
	
	if(Actualoutput.equals(Expectedoutput)) {
		System.out.println("Test Passed!");
	}else {
		System.out.println("Test Failed!");
	}
	
}

}
