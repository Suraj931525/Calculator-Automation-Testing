package test.calculator_testing;

import org.testng.annotations.Test;

public class CosTest extends Setup {


    @Test(priority = 1)
    public void cosZero() {

        System.out.println("Testing COS 0");

        clickCos();
        
        enterNumber("0");

        String actual = getResult();

        System.out.println("Actual Result: " + actual);
    }


    @Test(priority = 2)
    public void cosThirty() {

        System.out.println("Testing COS 30");

        clickCos();
        
        enterNumber("3");
        enterNumber("0");

        String actual = getResult();

        System.out.println("Actual Result: " + actual);

    }


    @Test(priority = 3)
    public void cosFortyFive() {

        System.out.println("Testing COS 45");

        clickCos();
        
        enterNumber("4");
        enterNumber("5");

        String actual = getResult();

        System.out.println("Actual Result: " + actual);
    }


    @Test(priority = 4)
    public void cosSixty() {

        System.out.println("Testing COS 60");

        clickCos();
        
        enterNumber("6");
        enterNumber("0");

        String actual = getResult();

        System.out.println("Actual Result: " + actual);
    }


    @Test(priority = 5)
    public void cosNinety() {

        System.out.println("Testing COS 90");

        clickCos();
        
        enterNumber("9");
        enterNumber("0");

        String actual = getResult();

        System.out.println("Actual Result: " + actual);

    }
}