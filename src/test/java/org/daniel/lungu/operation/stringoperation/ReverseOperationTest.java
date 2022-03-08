package org.daniel.lungu.operation.stringoperation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ReverseOperationTest {

	@Test
	void handel_shouldReturnReverseString_whenInputIsNotNull() {
		ReverseOperation reverseOperation = new ReverseOperation();

		assertEquals(reverseOperation.handel("abc"), "cba");
	}

	@Test
	void handel_shouldThrowException_whenInputIsNull() {
		ReverseOperation reverseOperation = new ReverseOperation();

		assertThrows(NullPointerException.class, () -> reverseOperation.handel(null));
	}

}
