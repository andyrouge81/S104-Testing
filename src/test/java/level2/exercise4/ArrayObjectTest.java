package level2.exercise4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayObjectTest {

	@Test
	void givenAnObjectArrayList_whenAddObjects_thenVerifyObjectsSort(){

		String word = new String("Hello");
		Integer number = 5;

		ArrayList<Object> actualList = new ArrayList<>();

		actualList.add(word);
		actualList.add(number);

		ArrayList<Object> expectedList = new ArrayList<>();

		expectedList.add(word);
		expectedList.add(number);


		assertIterableEquals(expectedList, actualList);

	}

	@Test
	void givenArrayList_whenAddObjects_thenVerifyTheOrderArrayList(){
		String word = new String("Hello");
		Integer number = 5;

		ArrayList<Object> list1 = new ArrayList<>();

		list1.add(word);
		list1.add(number);

		ArrayList<Object> list2 = new ArrayList<>();

		list2.add(number);
		list2.add(word);


		Set<Object> actualList = new HashSet<>(list1);
		Set<Object> expectedList = new HashSet<>(list2);


		assertEquals(expectedList, actualList);
	}


	@Test
	void givenArrayList_whenAddNoDuplicatesObject_thenVerifyTheObjectAddingOneTime(){

		String word = new String("Hello");
		Integer number = 5;

		ArrayList<Object> list1 = new ArrayList<>();

		list1.add(number);


		assertEquals(1, Collections.frequency(list1, number));


		assertFalse(list1.contains(word));
	}
}
