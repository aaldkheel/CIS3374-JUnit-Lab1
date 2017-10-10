package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2, 2));
	}

	@Test
	public void subtract() {
		assertEquals(2, calculator.subtract(5, 3));
	}
	
	@Test
	public void multiply() {
		assertEquals(16, calculator.multiply(8, 2));
	}
	
	@Test
	public void divide() {
		assertEquals(6, calculator.divide(12, 2));
	}
	
	@Test
	public void isEqualPass() {
		assertTrue(calculator.isEqual(4, 4));
	}
	
	@Test
	public void isEqualFail() {
		assertFalse(calculator.isEqual(1, 2));
	}

}
	
	

