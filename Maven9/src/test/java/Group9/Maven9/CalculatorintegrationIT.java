package Group9.Maven9;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;

public class CalculatorintegrationIT {
	public static Calculator calint;
	@BeforeClass
	public static void setup() {
		calint= new Calculator();
	
	}
	@Test
	public void it1() {
		assertEquals(4,calint.subtract(calint.add(4,4),calint.add(2,2)));
	}
	@Test
	public void it2() {
		assertEquals(12,calint.add(calint.add(4,4),calint.add(2,2)));
	}
	@Test
	public void it3() {
		assertEquals(4,calint.multiply(calint.add(1,1),calint.add(1,1)));
	}

}
