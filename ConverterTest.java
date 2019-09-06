package Vjezbe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConverterTest {

	Converter conv;
	
	@Before
	public void setUp(){
		conv = new Converter();
	}
	
	@Test
	public void shouldConvertKilogramsToPounds() {
		int pounds = conv.kilogramsToPounds(2);
		assertEquals(pounds, 4);
	}

	@Test
	public void shouldCovertPoundsToKilograms(){
		int pounds = conv.poundsToKilograms(4);
		assertEquals(pounds, 2);
	}
	
	@Test
	public void shouldInchToCentimeters() {
		int cen = conv.inchToCentimeters(2);
		assertEquals(cen, 6);
	}

	@Test
	public void shouldCantimetersToInch(){
		int inch = conv.centimetersToInch(9);
		assertEquals(inch, 3);
	}
}
