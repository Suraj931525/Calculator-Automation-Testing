package test.calculator_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Scientific_calc {
	
	ChromeDriver driver = new ChromeDriver();

    WebElement outputElement;

    String Actualoutput;
    String Expectedoutput;


    @AfterTest
    void startBrowser() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.calculator.net/");
    }


    // SIN TEST

    void sin() {

        driver.get("https://www.calculator.net/");

        driver.findElement(By.xpath("//span[contains(@onclick,'sin')]")).click();
        
        driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();

        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();

    }

    // COS TEST

    @Test
    void cos() {

        driver.get("https://www.calculator.net/");

        driver.findElement(By.xpath("//span[contains(@onclick,'cos')]")).click();

        driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();

    }


    // TAN TEST
    @Test
    void tan() {

        driver.get("https://www.calculator.net/");

        driver.findElement(By.xpath("//span[contains(@onclick,'tan')]")).click();
        
        driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();

    }
    
    @AfterTest
    void closeBrowser() {

        driver.quit();
    }

}
