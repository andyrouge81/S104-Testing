package level1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDniTest {

	@ParameterizedTest
	@CsvSource({"52357340,W","71634641,Z","88833388,M","89546734,Y","44556677,L","52357339,R","22442343,R",
			"43566544, J","65747255, F","45768543,S"})
	void givenNumberDni_whenCalculateLetter_thenVerifyTheCorrectLetter(int dni, String expextedWord) {
		String actualWord = CalculateDni.calculateWord(dni);

		assertEquals(expextedWord, actualWord, "The letter doesn't matching with the given number");
	}
}


