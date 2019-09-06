package Vjezbe;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddNumbersTest {

	AddNumbers operation;
	static int result;
	
	@BeforeClass
	public static void befClass(){
		result = 0;
	}
	
	@Before
	public void start(){
		operation = new AddNumbers();
	}
	
	@After
	public void end(){
		operation = null;
	}
	
	@Test
	public void shouldAddTwoNumbers() {
		result = operation.adding(5, 5);
		assertEquals(10, result);
	}

	@Test
	public void shouldSubtractTwoNumbers() {
		result = operation.subtract(5, 5);
		assertEquals(0, result);
	}
	
	@Test
	public void shouldMultiplyTwoNumbers() {
		result = operation.multiply(5, 5);
		assertEquals(25, result);
	}
	
	@Test
	public void shouldDivideTwoNumbers() {
		result = operation.subtract(5, 5);
		assertEquals(0, result);
	}
	
	@Test(expected=ArithmeticException.class)
	public void shouldThrowExceptionForWrongType() {
		result = operation.divide(5, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionForNum1() {
		result = operation.subtract(2, 5);
	}

}
