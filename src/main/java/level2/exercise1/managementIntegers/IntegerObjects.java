package level2.exercise1.managementIntegers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerObjects {


	public static String compareIntegers(Scanner enter){
		String equals="";

		try{
			System.out.println("Fist number: ");
			int num1 = enter.nextInt();
			System.out.println("Second number: ");
			int num2 = enter.nextInt();
			equals = (num1 == num2) ? "The numbers are equals" : "The numbers are not equals.";


		}catch (InputMismatchException e){
			System.err.println("Error. This is not a number."+e.getMessage());
		}

		return equals;
	}

}

