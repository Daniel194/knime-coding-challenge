package org.daniel.lungu.operation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OperationFactoryProviderTest {

	@Test
	void getOperation_shouldReturnOperation_whenInputTypeIsValid() {
		assertNotNull(OperationFactoryProvider.getOperation(InputTypes.INTEGER, Operations.REVERSE));
		assertNotNull(OperationFactoryProvider.getOperation(InputTypes.DOUBLE, Operations.NEGATION));
		assertNotNull(OperationFactoryProvider.getOperation(InputTypes.STRING, Operations.REVERSE));
	}
}
