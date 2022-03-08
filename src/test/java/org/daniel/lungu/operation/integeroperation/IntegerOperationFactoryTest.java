package org.daniel.lungu.operation.integeroperation;

import static org.junit.jupiter.api.Assertions.*;

import org.daniel.lungu.operation.Operations;
import org.junit.jupiter.api.Test;

public class IntegerOperationFactoryTest {

	@Test
	void create_shouldReturnRightOperation_whenOperationIsSupported() {
		IntegerOperationFactory factory = new IntegerOperationFactory();

		assertNotNull(factory.create(Operations.REVERSE));
		assertNotNull(factory.create(Operations.NEGATION));
	}

	@Test
	void create_shouldThrowException_whenOperationIsNotSupported() {
		IntegerOperationFactory factory = new IntegerOperationFactory();

		assertThrows(IllegalArgumentException.class, () -> factory.create(Operations.CAPITALIZE));
	}

}
