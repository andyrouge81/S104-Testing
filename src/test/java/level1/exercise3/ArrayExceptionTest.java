package level1.exercise3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayExceptionTest {

	@DisplayName("Given an Array we have to throw an 'ArrayIndexOutOfBoundsException' and proof if the methods works.")
	@Test
	void givenAMethod_whenThrowsAnArrayExceptionOutOfBound_thenVerifyWorksCorrect() {
		Exception ex = assertThrows(ArrayIndexOutOfBoundsException.class, () ->
			ArrayException.exceptionLaunch(4));


	}
}
