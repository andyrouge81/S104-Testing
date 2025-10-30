package level3.exercise1;

import level3.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
	@DisplayName("Adding two numbers.")
	@Test
	void givenTwoNumbers_whenAddNumbers_thenTheAddISEquals(){

		Calculator calculator = new Calculator();

		double a = 5;
		double b = 7;
		double actualOperation = calculator.calculateAdd(a, b);
		double expectedOperation = 12;

		assertEquals(expectedOperation, actualOperation, "The add result should be 12");

	}

	@DisplayName("The subtract of two numbers")
	@Test
	void givenTwoNumbers_whenSubtractNumbers_thenTheSubtractEquals(){
		Calculator calculator = new Calculator();

		double a = 7;
		double b = 4;

		double actualSubstraction = calculator.calculateSubtract(a, b);
		double expectedSubtract = 3;

		assertEquals(expectedSubtract, actualSubstraction, "The subtraction result should be 3");
	}

	@DisplayName("The multiply of two numbers")
	@Test
	void giventwoNumbers_whenMultiplyNumbers_thenMultiplyIsEquals(){
		Calculator calculator = new Calculator();

		double a = 6;
		double b = 6;

		double actualMultiply = calculator.calculateMultiply(a, b);
		double expectedMultiply = 36;

		assertEquals(expectedMultiply, actualMultiply, "The multiplycation result should be 36");
	}


	@Test
	void givenTwoNumbers_whenDivideNumbers_thenDivideIsEquals(){

		Calculator calculator = new Calculator();

		double a = 8;
		double b = 0;


		RuntimeException re = assertThrows(ArithmeticException.class, () ->
				calculator.calculateDivision(a, b));

		assertEquals("Divide by zero.", re.getMessage());

	}





}
