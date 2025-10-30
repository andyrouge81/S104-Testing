package level2.exercise7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalObjectTest {

	@Test
	void givenAnOptionalObject_whenMakeObjectEmpty_thenIsEmptyObjectIsTrue(){


		Optional obj1 = Optional.empty();


		assertTrue(obj1.isEmpty());// return true
	}
}
