package Vjezbe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardValidationTest {

	CardValidation cv;
	int[] singleCardNumbers;
	int[] everySecondDigit;
	
	@Before
	public void setUp(){
		cv = new CardValidation();
	}
	
	@Test
	public void shouldReturnTrueIfTheCardNumberIsValid(){
		boolean valid = cv.isValid(5688576018402626L);
		assertTrue(valid);
	}
	
	@Test
	public void shouldReturnTheNumberOfDigitsInTheNumber(){
		int numberOfDigits = cv.getSize(88576018402626L);
		assertEquals(14, numberOfDigits);
	}
	
	@Test
	public void shouldReturnTureIfThePrefixIsForNumber(){
		boolean prefixMatched = cv.getPrefix(3788576018402626L, 37);
		assertTrue(prefixMatched);
	}
	
	@Test
	public void shouldReturnArrayOfSingleIntegers() {
		singleCardNumbers = cv.toSingleIntegersDigits(4388576018402626L);
		assertEquals(5, singleCardNumbers[4]);
	}

	@Test
	public void shouldMultiplyEverySecondDigitByTwoFromRightToLeft() {
		everySecondDigit = cv.everySecondDigitMultiplyByTwo(4388576018402626L);
		assertEquals(2, everySecondDigit[3]);
	}
	
	@Test
	public void shouldReturnTotalSumOfAllSecondSingleDigits() {
		int[] digits = cv.everySecondDigitMultiplyByTwo(4388576018402626L);
		int total = cv.sumOfSecondDigits(digits);
		assertEquals(37, total);
	}
	
	@Test
	public void shouldReturnTotalOfAllDigitsFromTheFirstStep(){
		int totalFirst = cv.addDigitsFromTheFirstStep(4388576018402626L);
		assertEquals(37, totalFirst);
	}
	
	@Test
	public void shouldReturnTotalOfAllOddNumbersFromRightToLeft(){
		int totalOdd = cv.addOddDigitsFromRight(4388576018402626L);
		assertEquals(38, totalOdd);
	}
	
	@Test
	public void shouldReturnTrueIfTheSumOfTwoStepsIsDivisibleBy10(){
		boolean valid = cv.validCardNumber(4388576018402626L);
		assertFalse(valid);
		valid = cv.validCardNumber(4388576018410707L);
		assertTrue(valid);
	}
}
