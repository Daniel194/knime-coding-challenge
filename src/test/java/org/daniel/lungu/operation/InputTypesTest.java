package org.daniel.lungu.operation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InputTypesTest {

	@Test
	void fromString_shouldReturnInputTypeEnum_whenStringValueIsCorrect() {
		assertEquals(InputTypes.fromString("double"), InputTypes.DOUBLE);
		assertEquals(InputTypes.fromString("string"), InputTypes.STRING);
		assertEquals(InputTypes.fromString("int"), InputTypes.INTEGER);
	}

	@Test
	void fromString_shouldThrowException_whenStringValueIsIncorrect() {
		assertThrows(IllegalArgumentException.class, () -> InputTypes.fromString("wrong_value"));
	}

}
