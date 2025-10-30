package level2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SameLengthArrayTest {

	@DisplayName("Given two integer Arrays, compare both to be equals.")
	@Test
	void givenTwoIntegerArrays_whenCompare_thenArraysAreEquals(){
		int[] actualArray = {1,2};
		int[] expectedArray = {1,2};

		assertArrayEquals(expectedArray, actualArray);

	}
}
