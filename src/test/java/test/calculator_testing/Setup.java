package test.calculator_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Setup {
	
	protected WebDriver driver;

    // BEFORE SUITE

    @BeforeSuite
    public void beforeSuite() {

        System.out.println("Before Suite");
        System.out.println("Calculator Automation Started");
    }

    
    // BEFORE TEST

    @BeforeTest
    public void beforeTest() {

        System.out.println("Before Test");
        System.out.println("Starting Calculator Test");
    }


    // BEFORE CLASS

    @BeforeClass
    public void beforeClass() {

        System.out.println("Before Class");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }


    // BEFORE METHOD

    @BeforeMethod
    public void beforeMethod() {

        System.out.println("Before Method");

        driver.get("https://www.calculator.net/");
    }


    // COMMON METHODS

    // Enter number
    public void enterNumber(String number) {

        WebElement numberButton = driver.findElement(By.xpath("//span[@onclick='r(" + number + ")']"));

        numberButton.click();
    }


    // Click SIN
    public void clickSin() {

        driver.findElement(By.xpath("//span[@onclick=\"r('sin')\"]")).click();
    }


    // Click COS
    public void clickCos() {

        driver.findElement(By.xpath("//span[@onclick=\"r('cos')\"]")).click();
    }


    // Click TAN
    public void clickTan() {

        driver.findElement(By.xpath("//span[@onclick=\"r('tan')\"]")).click();
    }


    // Get calculator display
    public String getResult() {
    		
    	WebElement resulteElement = driver.findElement(By.id("sciOutPut"));

        return resulteElement.getText();
    }


    // Clear calculator
    public void clearCalculator() {

        // UPDATE LOCATOR
        driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    }


    // AFTER METHOD

    @AfterMethod
    public void afterMethod() {

        System.out.println("After Method");

        clearCalculator();
    }



    // AFTER CLASS

    @AfterClass
    public void afterClass() {

        System.out.println("After Class");

        if (driver != null) {
            driver.quit();
        }
    }



    // AFTER TEST

    @AfterTest
    public void afterTest() {

        System.out.println("After Test");
    }


    // AFTER SUITE

    @AfterSuite
    public void afterSuite() {

        System.out.println("After Suite");
        System.out.println("Calculator Automation Completed");
    }


}
