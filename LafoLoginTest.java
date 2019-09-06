package Vjezbe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LafoLoginTest {

	LafoLogin ll;
	
	@Before
	public void setUp(){
		ll = new LafoLogin();
	}
	@Test
	public void shouldReturnFalseIfUserNameOrPasswordIsNull() {
		assertFalse(LafoLogin.isNull(null));
	}
	
	@Test
	public void shouldReturnFalseIfUserNameOrPasswordIsEmptyString() {
		assertFalse(ll.isEmptyString(""));
	}

	@Test
	public void shouldReturnTrueIfUserNameIsShorterThan10Characters() {
		assertTrue(ll.isShorter10("jasmin"));
	}
}
