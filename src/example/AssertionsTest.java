package example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
	
	Calculator calculator;
	@BeforeEach
	public void init() {
		calculator=new Calculator();
	}
	
	@Test
	public void assertEqualsTest() {
		int sum=calculator.add(10, 20);

		//Assertions.assertEquals(3, sum);
		assertEquals(30, sum, "Test passed due to equal value");
	}
	
	@Test
	public void assertNotEqualsTest() {
		int sum=calculator.add(5, 5);
		assertNotEquals(0,sum);
	}
	
	@Test
	public void assertArrayEqualsTest() {
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	}
	
	@Test
	public void assertNullTest() {
		String nullStr=null;
		String notNullStr="Aman";
		
		assertNotNull(notNullStr);
		assertNull(nullStr);
	}
	
	@Test
	public void assertTrueTest() {
		boolean trueVal=true;
		assertTrue(trueVal);
	}
	
	@Test
	public void assertFailTest() {
		boolean falseVal=true;
		assertFalse(falseVal, "Test failed as value get true");
	}
}
