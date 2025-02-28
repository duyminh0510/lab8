package com.poly.Lab8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator calcu = new Calculator();
	
	@Test
	public void testadd() {
		Assert.assertEquals(calcu.add(15, 15), 30);
	}
	
	@Test
	public void testsubtract() {
		Assert.assertEquals(calcu.subtract(64, 24), 40);
	}

	@Test
	public void testmultiply() {
		Assert.assertEquals(calcu.multiply(10, 10), 100);
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testdivide() {
		calcu.divide(10, 0);
	}
}
