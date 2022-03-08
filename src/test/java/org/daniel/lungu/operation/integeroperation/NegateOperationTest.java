package org.daniel.lungu.operation.integeroperation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NegateOperationTest {

	@Test
	void handel_shouldReturnNegativeNumber_whenInputIsValid() {
		NegateOperation operation = new NegateOperation();

		assertEquals(operation.handel("0123"), "-123");
	}

	@Test
	void handel_shouldThrowException_whenInputIsNull() {
		NegateOperation operation = new NegateOperation();

		assertThrows(NullPointerException.class, () -> operation.handel(null));
	}

	@Test
	void handel_shouldThrowException_whenInputIsNotANumber() {
		NegateOperation operation = new NegateOperation();

		assertThrows(NumberFormatException.class, () -> operation.handel("abc"));
	}

}
