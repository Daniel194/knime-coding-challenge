package org.daniel.lungu.operation.doubleoperation;

import static org.junit.jupiter.api.Assertions.*;

import org.daniel.lungu.operation.Operations;
import org.junit.jupiter.api.Test;

public class DoubleOperationFactoryTest {

	@Test
	void create_shouldReturnRightOperation_whenOperationIsSupported() {
		DoubleOperationFactory factory = new DoubleOperationFactory();

		assertNotNull(factory.create(Operations.NEGATION));
	}

	@Test
	void create_shouldThrowException_whenOperationIsNotSupported() {
		DoubleOperationFactory factory = new DoubleOperationFactory();

		assertThrows(IllegalArgumentException.class, () -> factory.create(Operations.CAPITALIZE));
		assertThrows(IllegalArgumentException.class, () -> factory.create(Operations.REVERSE));
	}

}
