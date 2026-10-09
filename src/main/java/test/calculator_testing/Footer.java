package test.calculator_testing;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import test.automation_testing.iframehandle;
import test.automation_testing.window_handle;

public class Footer {

	public static void main(String[] args) {

		Footer ob = new Footer();
		
		System.out.println("--------------------About Us Test-----------------------");
		ob.aboutus();
		System.out.println("--------------------SiteMap Test-----------------------");
		ob.sitemap();
		System.out.println("--------------------Term of Use Test-----------------------");
		ob.termofuse();
		System.out.println("--------------------Privacy Policy Test-----------------------");
		ob.privacypolicy();

	}
	
	ChromeDriver driver = new ChromeDriver();
	String ActualUrl;
	String ExpectedUrl;
	
	
	void launchbrowser() {
		
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
	}
	
	void closeBrowser() {

	    driver.quit();
	}
	
	void aboutus() {
		
		driver.get("https://www.calculator.net/");
		
		driver.findElement(By.xpath("(//div[@id='footernav']/a)[1]")).click();
		
		ActualUrl = driver.getCurrentUrl();
		ExpectedUrl = "https://www.calculator.net/about-us.html";
		
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
		
	}
	
	void sitemap() {
		
		driver.get("https://www.calculator.net/");
		
		driver.findElement(By.xpath("(//div[@id='footernav']/a)[2]")).click();
		
		ActualUrl = driver.getCurrentUrl();
		ExpectedUrl = "https://www.calculator.net/sitemap.html";
		
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
	}
	
	
	void termofuse() {
		
		driver.get("https://www.calculator.net/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@id='footernav']/a)[3]")).click();
		
		ActualUrl = driver.getCurrentUrl();
		ExpectedUrl = "https://www.calculator.net/about-us.html#terms";
		
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
	}
	
	void privacypolicy() {
		
		driver.get("https://www.calculator.net/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@id='footernav']/a)[4]")).click();
		
		ActualUrl = driver.getCurrentUrl();
		ExpectedUrl = "https://www.calculator.net/about-us.html#privacy";
		
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
	}

}
