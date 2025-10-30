package level3;

public class Calculator {

	public double calculateAdd(double a, double b){

		return a + b;
	}

	public double calculateSubtract(double a, double b){

		return a - b;
	}

	public double calculateMultiply(double a, double b){

		return a * b;
	}

	public void calculateDivision(double a, double b){

		if(b==0){
			throw new ArithmeticException("Divide by zero.");
		}

	}
}
