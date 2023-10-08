package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpectedExceptionsTest {
	
	@Test
	public void expectedExceptionTest1() {
		Assertions.assertThrows(ArithmeticException.class, ()->divide(1, 0));
		System.out.println("Test passed...as we handled the exception");
	}
	
	@Test
	public void expectedExceptionTest2() {
		Assertions.assertThrows(ArithmeticException.class, ()->divide(0, 0));
	}
	
	private int divide(int a,int b) {
		return a/b;
	}
	
	@Test
	public void expectedExceptionTest3() {
		Assertions.assertThrows(FileNotFoundException.class, ()->readFile());
	}
	
	private void readFile() throws IOException {
		FileInputStream fis=new FileInputStream("/abc.xml");
		fis.read();
		fis.close();
	}
}
