package level2.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SameReferenceObject {
	@Test
	void givenTwoObjects_whenCompareTheReference_theReferenceIsSame() {
		String actualReference = "mocca";
		String expectedReference = actualReference;

		assertSame(expectedReference, actualReference, "The reference point at the same object.");
	}

	@Test
	void givenTwoObjects_whenCompareTheReference_theReferenceIsNotSame() {
		String actualReference = new String("hola");
		String expectedReference = new String("hola");

		assertNotSame(expectedReference, actualReference, "The reference point does not the sasme.");
	}
}
