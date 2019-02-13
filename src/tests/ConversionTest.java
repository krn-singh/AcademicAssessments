package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import impl.Conversion;

class ConversionTest {

	@Test
	void testTempConversion() {
		
		Conversion underTest = new Conversion();
		
		double result = underTest.tempConversion(80.0, "");
		
		assertEquals(175.0, result, 1.0);
	}

}
