package level2.exercise5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashMapKeyTest {

	@Test
	void givenHashMap_whenAddKeyValue_thenContainsTheKey(){

		HashMap<String, Integer> womansMap = new HashMap<>();

		womansMap.put("Juana", 23);
		womansMap.put("Natalia", 44);

		assertTrue(womansMap.containsKey("Juana"));

	}
}
