package org.daniel.lungu.operation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OperationsTest {

	@Test
	void fromString_shouldReturnOperationEnum_whenStringValueIsCorrect() {
		assertEquals(Operations.fromString("neg"), Operations.NEGATION);
		assertEquals(Operations.fromString("capitalize"), Operations.CAPITALIZE);
		assertEquals(Operations.fromString("reverse"), Operations.REVERSE);
	}

	@Test
	void fromString_shouldThrowException_whenStringValueIsIncorrect() {
		assertThrows(IllegalArgumentException.class, () -> Operations.fromString("wrong_value"));
	}

}
