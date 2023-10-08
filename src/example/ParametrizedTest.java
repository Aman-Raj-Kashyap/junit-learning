package example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTest {
	/*
	 * @ValueSource
	 * @EnumSource
	 * @MethodSource
	 * @CsvSource
	 * @CsvFileSource
	 * @ArgumentsSource
	 */
	
	//----------------------------@ValueSource----------------------------
	@ParameterizedTest(name="{index} - Run test with args={0}")
	@ValueSource(ints = {1,5,3,8,4})
	public void valueSourceTest(int args) {
		System.out.println(args);
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Apple", "Mango", "Banana", "Papaya", "Guava"})
	public void valueSourceTest(String args) {
		System.out.println(args);
	}
	
	//----------------------------@EnumSource----------------------------
	enum Fruits{
		Apple, Mango, Banana, Papaya
	}
	
	@ParameterizedTest
	@EnumSource(Fruits.class)
	public void enumSourceTest(Fruits fruits) {
		System.out.println(fruits);
	}
	
	
	//----------------------------@MethodSource----------------------------
	private static String[] fruits() {
		return new String[] {"Apple", "Mango", "Banana", "Papaya", "Guava"};
	}
	
	private static Object[][] values() {
		return new Object[][] {
				{"Java","Programming Language"},
				{"Junit","Testing framework"},
				{"Spring","DI Framework"}
		};
	}
	
	@ParameterizedTest
	@MethodSource("fruits")
	public void methodSourceTest(String fruit) {
		System.out.println(fruit);
	}
	
	@ParameterizedTest
	@MethodSource("values")
	public void methodSourceTest(String lang, String desc) {
		System.out.println(lang+"-"+desc);
	}
	
	
	//----------------------------@CsvSource----------------------------
	@ParameterizedTest
	@CsvSource({
			"Java, Programming Language",
			"Junit, Testing framework",
			"Spring, DI Framework",
			"Hadoop, Big Data Framework"
	})
	public void csvSourceTest(String lang, String desc) {
		System.out.println(lang+"-"+desc);
	}
}
