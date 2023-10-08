package example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JTest {
	@BeforeAll
	public static void beforeAllMethod(){
		System.out.println("Loading to DB");
	}
	
	@AfterAll
	public static void afterAllMethod(){
		System.out.println("Exiting to DB");
	}
	
	Calculator calculator;
	@BeforeEach
	public void init() {
		calculator=new Calculator();
	}
	
	@AfterEach
	public void done() {
		System.out.println("sum of numbers done!");
	}
	
	@Test
	@DisplayName("Sum of positive numbers")
	public void testMethod1() {
		int sum=calculator.add(10, 20);
		System.out.println("Sum is:"+sum);
	}
	
	@Test
	@DisplayName("Sum of negative numbers")
	public void testMethod2() {
		int sum=calculator.add(-10, -20);
		System.out.println("Sum is:"+sum);
	}
}
