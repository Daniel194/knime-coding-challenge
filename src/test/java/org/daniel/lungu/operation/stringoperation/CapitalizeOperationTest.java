package org.daniel.lungu.operation.stringoperation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CapitalizeOperationTest {

	@Test
	void handel_shouldCapitalizeString_whenInputIsNotNull() {
		CapitalizeOperation operation = new CapitalizeOperation();

		assertEquals(operation.handel("abc"), "ABC");
	}

	@Test
	void handel_shouldThrowException_whenInputIsNull() {
		CapitalizeOperation operation = new CapitalizeOperation();

		assertThrows(NullPointerException.class, () -> operation.handel(null));
	}

}
