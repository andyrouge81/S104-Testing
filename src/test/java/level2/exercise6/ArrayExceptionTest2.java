package level2.exercise6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class ArrayExceptionTest2 {

	@Test
	void givenInvalidIndex_whenVerifyTheIndex_thenThrowArrayIndexOutOfBound() {
		Exception e = assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () ->
        ArrayException2.outBoundLaunchException(4));
	}
}
