package level2.exercise1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class IntegerObjectsTest {


	@Test
	void givenTwoIntegerNumbers_whenCompareIntegers_thenIntegersAreEquals() {

		Integer expectedInteger = 4;
		Integer actualInteger = 4;

		assertEquals(expectedInteger, actualInteger);
	}

	@Test
	void givenTwoIntegerNumbers_whenCompareIntegers_thenIntegersAreNotEquals() {
		Integer expectedInteger = 5;
		Integer actualInteger = 3;
		assertNotEquals(expectedInteger, actualInteger);
	}
}
