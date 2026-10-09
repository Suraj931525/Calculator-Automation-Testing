package test.calculator_testing;

import org.testng.annotations.Test;

public class SinTest extends Setup {

	 @Test(priority = 1)
	    public void sinZero() {

	        System.out.println("Testing SIN 0");

	        clickSin();
	        
	        enterNumber("0");

	        String actual = getResult();

	        System.out.println("Actual Result: " + actual);

	    }


	    @Test(priority = 2)
	    public void sinThirty() {

	        System.out.println("Testing SIN 30");

	        clickSin();
	        
	        enterNumber("3");
	        enterNumber("0");

	        String actual = getResult();

	        System.out.println("Actual Result: " + actual);
	    }


	    @Test(priority = 3)
	    public void sinFortyFive() {

	        System.out.println("Testing SIN 45");

	        clickSin();
	        
	        enterNumber("4");
	        enterNumber("5");

	        String actual = getResult();

	        System.out.println("Actual Result: " + actual);

	    }


	    @Test(priority = 4)
	    public void sinSixty() {

	        System.out.println("Testing SIN 60");

	        clickSin();
	        
	        enterNumber("6");
	        enterNumber("0");

	        String actual = getResult();

	        System.out.println("Actual Result: " + actual);

	    }


	    @Test(priority = 5)
	    public void sinNinety() {

	        System.out.println("Testing SIN 90");

	        clickSin();
	        
	        enterNumber("9");
	        enterNumber("0");

	        String actual = getResult();

	        System.out.println("Actual Result: " + actual);

	    }
	}