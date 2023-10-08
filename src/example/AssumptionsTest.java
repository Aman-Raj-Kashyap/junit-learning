package example;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
	@Test
	public void assumeTrueTest() {
		Assumptions.assumeTrue(false);
		System.out.println("Executing assumption is true");
	}
	
}
