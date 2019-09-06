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

}
