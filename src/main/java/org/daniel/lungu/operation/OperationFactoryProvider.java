package org.daniel.lungu.operation;

import org.daniel.lungu.operation.doubleoperation.DoubleOperationFactory;
import org.daniel.lungu.operation.integeroperation.IntegerOperationFactory;
import org.daniel.lungu.operation.stringoperation.StringOperationFactory;

/**
 * Operation factory provider
 *
 * @author Daniel Lungu
 */
public class OperationFactoryProvider {

	/**
	 * Get the operation for the input type.
	 *
	 * @param inputType enum value of the input type
	 * @param operation enum value of the operation type
	 * @return the operation of the input type
	 */
	public static Operation getOperation(InputTypes inputType, Operations operation) {
		switch (inputType) {
			case STRING -> {
				return new StringOperationFactory().create(operation);
			}
			case INTEGER -> {
				return new IntegerOperationFactory().create(operation);
			}
			case DOUBLE -> {
				return new DoubleOperationFactory().create(operation);
			}
			default -> throw new IllegalArgumentException("The input type is not supported!");
		}
	}
}
