package test.calculator_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scientific_Calc {
	public static void main(String[] args) {

        Scientific_Calc ob = new Scientific_Calc();

        ob.startBrowser();

        System.out.println("-------------------- Sin Test -----------------------");
        ob.sin();

        System.out.println("-------------------- Cos Test -----------------------");
        ob.cos();

        System.out.println("-------------------- Tan Test -----------------------");
        ob.tan();

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


    // SIN TEST

    void sin() {

        driver.get("https://www.calculator.net/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[contains(@onclick,'sin')]")).click();
        
        driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();

        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();

        outputElement = driver.findElement(By.id("sciOutPut"));

        Actualoutput = outputElement.getText();

        Expectedoutput = " 0.5";

        if (Actualoutput.equals(Expectedoutput)) {

            System.out.println("Test Passed!");

        } else {

            System.out.println("Test Failed!");
        }
    }

    // COS TEST

    void cos() {

        driver.get(
                "https://www.calculator.net/"
        );

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[contains(@onclick,'cos')]")).click();

        driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();

        outputElement =driver.findElement(By.id("sciOutPut"));

        Actualoutput = outputElement.getText();

        Expectedoutput = " 0.5";

        if (Actualoutput.equals(Expectedoutput)) {

            System.out.println("Test Passed!");

        } else {

            System.out.println("Test Failed!");
        }
    }


    // TAN TEST

    void tan() {

        driver.get("https://www.calculator.net/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[contains(@onclick,'tan')]")).click();
        
        driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();


        outputElement =driver.findElement(By.id("sciOutPut"));

        Actualoutput = outputElement.getText();

        Expectedoutput = " 1";


        if (Actualoutput.equals(Expectedoutput)) {

            System.out.println("Test Passed!");

        } else {

            System.out.println("Test Failed!");
        }
    }

}
