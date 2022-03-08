package org.daniel.lungu.operation.stringoperation;

import static org.junit.jupiter.api.Assertions.*;

import org.daniel.lungu.operation.Operations;
import org.junit.jupiter.api.Test;

public class StringOperationFactoryTest {

	@Test
	void create_shouldReturnRightOperation_whenOperationIsSupported() {
		StringOperationFactory factory = new StringOperationFactory();

		assertNotNull(factory.create(Operations.CAPITALIZE));
		assertNotNull(factory.create(Operations.REVERSE));
	}

	@Test
	void create_shouldThrowException_whenOperationIsNotSupported() {
		StringOperationFactory factory = new StringOperationFactory();

		assertThrows(IllegalArgumentException.class, () -> factory.create(Operations.NEGATION));
	}

}
