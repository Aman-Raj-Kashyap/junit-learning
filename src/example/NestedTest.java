package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {
	Calculator calculator;
	
	@BeforeEach
	public void init() {
		calculator=new Calculator();
	}
	
	
	@Nested
	class AddPositive{
		@Test
		public void addSmallPositiveNumber() {
			int sum=calculator.add(2,3);
			System.out.println(sum);
		}
		
		@Test
		public void addBigPositiveNumber() {
			int sum=calculator.add(100002,300012);
			System.out.println(sum);
		}
	}
	
	@Nested
	class AddNegative{
		@Test
		public void addSmallNegativeNumber() {
			int sum=calculator.add(-2,-3);
			System.out.println(sum);
		}
		
		@Test
		public void addBigNegativeNumber() {
			int sum=calculator.add(-1002,-3022);
			System.out.println(sum);
		}
	}
	
}
