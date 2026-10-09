package test.calculator_testing;

import org.testng.annotations.Test;

public class TanTest extends Setup {


    @Test(priority = 1)
    public void tanZero() {

        System.out.println("Testing TAN 0");

        clickTan();
        
        enterNumber("0");

        String actual = getResult();

        System.out.println("Actual Result: " + actual);

    }


    @Test(priority = 2)
    public void tanThirty() {

        System.out.println("Testing TAN 30");

        clickTan();
        
        enterNumber("3");
        enterNumber("0");

        String actual = getResult();

        System.out.println("Actual Result: " + actual);

    }


    @Test(priority = 3)
    public void tanFortyFive() {

        System.out.println("Testing TAN 45");

        clickTan();
        
        enterNumber("4");
        enterNumber("5");

        String actual = getResult();

        System.out.println("Actual Result: " + actual);

    }


    @Test(priority = 4)
    public void tanSixty() {

        System.out.println("Testing TAN 60");

        clickTan();
        
        enterNumber("6");
        enterNumber("0");

        String actual = getResult();

        System.out.println("Actual Result: " + actual);

    }


    @Test(priority = 5)
    public void tanNinety() {

        System.out.println("Testing TAN 90");

        clickTan();
        
        enterNumber("9");
        enterNumber("0");

        String actual = getResult();

        System.out.println("Actual Result: " + actual);
    }
}