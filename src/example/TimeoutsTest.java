package example;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutsTest {
	@Test
	@Timeout(6)
	@Disabled
	public void timeoutTest() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Test passed within time");
	}
	
	@Test
	@Timeout(6)
	@Disabled
	public void timeoutTest1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Test passed within time");
	}
	
	@Test
	public void timeoutTest2() throws InterruptedException {
		Assertions.assertTimeout(Duration.ofSeconds(7), ()->delaySeconds(6));
		System.out.println("Test passed within time");
	}
	
	private void delaySeconds(int second) throws InterruptedException {
		TimeUnit.SECONDS.sleep(second);
	}
}
