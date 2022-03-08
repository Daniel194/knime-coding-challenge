package org.daniel.lungu.operation.integeroperation;

import org.daniel.lungu.operation.Operation;
import org.daniel.lungu.operation.OperationFactory;
import org.daniel.lungu.operation.Operations;

/**
 * Integer Operation factory
 *
 * @author Daniel Lungu
 */
public class IntegerOperationFactory implements OperationFactory {

	/**
	 * Crate the operation class for integer input type, otherwise throw IllegalArgumentException.
	 *
	 * @param operation enum value from Operations
	 * @return the operation for the integer type
	 */
	@Override
	public Operation create(Operations operation) {
		switch (operation) {
			case REVERSE -> {
				return new ReverseOperation();
			}
			case NEGATION -> {
				return new NegateOperation();
			}
			default -> throw new IllegalArgumentException("The operation is not supported by integer values");
		}
	}
}
