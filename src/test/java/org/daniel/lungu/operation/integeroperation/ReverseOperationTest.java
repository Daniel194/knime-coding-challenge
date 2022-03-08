package org.daniel.lungu.operation.integeroperation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ReverseOperationTest {

	@Test
	void handel_shouldReturnReverseNumber_whenInputIsValid() {
		ReverseOperation operation = new ReverseOperation();

		assertEquals(operation.handel("01230"), "321");
	}

	@Test
	void handel_shouldThrowException_whenInputIsNull() {
		ReverseOperation operation = new ReverseOperation();

		assertThrows(NullPointerException.class, () -> operation.handel(null));
	}

	@Test
	void handel_shouldThrowException_whenInputIsNotANumber() {
		ReverseOperation operation = new ReverseOperation();

		assertThrows(NumberFormatException.class, () -> operation.handel("abc"));
	}

}
