package level1.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculateDni {
	public static void main(String[] args) {

		System.out.println(calculateWord(45768543));

	}


	public static String calculateWord(int number) {
		List<String> dniWord = new ArrayList<>(Arrays.asList("T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J","Z", "S",
				"Q", "V", "H", "L", "C", "K", "E"));
		int restLetter = number % 23;

		return dniWord.get(restLetter);
	}
}
