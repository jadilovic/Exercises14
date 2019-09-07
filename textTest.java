package Vjezbe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class textTest {

	Text tx;
	
	@Before
	public void setUp(){
		tx = new Text();
	}
	
	@Test
	public void shouldReturnTrueIfItIsString() {
		boolean value = tx.isString("word");
		assertTrue(value);
	}
	
	@Test
	public void shouldReturnLengthOfTheString(){
		int length = tx.getLength("dog");
		assertEquals(length, 3);
	}

	@Test
	public void shouldShowAllCharactersAtEvenPositions(){
		String ch = tx.charsAtEvensOrOdds("word", true);
		assertEquals("od", ch);
	}
	
	@Test
	public void shouldShowAllCharactersAtOddPositions(){
		String ch = tx.charsAtEvensOrOdds("word", false);
		assertEquals("wr", ch);
	}
	
	@Test
	public void shoudShowNumberOfUpperCaseCharacters(){
		int numUpperChar = tx.numberUpperAndLowerCase("WhatThat", "upper");
		assertEquals(2, numUpperChar);
		int numLowerChar = tx.numberUpperAndLowerCase("What! That?:", "lower");
		assertEquals(6, numLowerChar);
		int numOtherChar = tx.numberUpperAndLowerCase("Wh at! Th at?:", "other");
		assertEquals(3, numOtherChar);
	}
}
