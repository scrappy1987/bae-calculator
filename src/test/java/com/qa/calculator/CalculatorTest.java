package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class CalculatorTest {

	@Test
	public void addCalculatorTest() {
		Calculator calc = new Calculator();
		String addResult = calc.add(2,2);
		Assert.assertEquals("The result is 4", addResult);
	}

}
