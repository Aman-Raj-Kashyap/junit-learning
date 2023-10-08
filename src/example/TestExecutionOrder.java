package example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@TestMethodOrder(MethodOrderer.Random.class)
public class TestExecutionOrder {
	@Test
	@Order(4)
	public void test1() {
		System.out.println("this is test1");
	}
	
	@Test
	@Order(3)
	public void test2() {
		System.out.println("this is test2");
	}
	
	@Test
	@Order(2)
	public void test3() {
		System.out.println("this is test3");
	}
	
	@Test
	@Order(1)
	public void test4() {
		System.out.println("this is test4");
	}
}
