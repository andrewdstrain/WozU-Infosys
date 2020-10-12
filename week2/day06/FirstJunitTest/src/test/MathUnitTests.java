package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.MathUtil;

@DisplayName("Math Utils")
class MathUnitTests {
	private MathUtil calc;
	
	public MathUnitTests() {
		calc = new MathUtil();
	}

	@Test
	void test() {
		assertEquals(1, calc.add(0, 1));;
		assertEquals(6, calc.add(3, 3));;
	}

}
