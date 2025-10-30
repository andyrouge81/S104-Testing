package level2.exercise1.main;

import java.util.Scanner;

import static level2.exercise1.managementIntegers.IntegerObjects.compareIntegers;

public class Main {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);

		System.out.println("Enter two numbers equals or not equals.");


		System.out.println(compareIntegers(enter));

		enter.close();
	}
}
