package example;

import org.junit.jupiter.api.Test;

public class RepeatedTest {
//	@Test
	@org.junit.jupiter.api.RepeatedTest(3)
	public void repeatedTestMethod() {
		System.out.println("executing test multiple times");
	}
	
	@org.junit.jupiter.api.RepeatedTest(value = 4, name="{displayName} - repitition - {currentRepetition}/{totalRepetitions}")
	public void repeatedTestMethod1() {
		System.out.println("executing test multiple times");
	}
}
