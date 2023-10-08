package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {
	/**
	 * condition on OS
	 * condition on particular JRE
	 * condition on JRE range
	 * condition on System properties
	 */
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	public void conditionOnOS() {
		System.out.println("Execute this test only on Windows Machine");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_17)
	public void conditionOnJRE() {
		System.out.println("Execute this test only on Java 17");
	}
	
	@Test
	@EnabledIfSystemProperty(named = "user.dir", matches="C:/Users/Admin/eclipse-workspace/junitTutorial")
	public void conditionOnSystemProperty() {
		System.out.println(System.getProperty("user.dir"));
	}
}
