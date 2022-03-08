package org.daniel.lungu.operation.doubleoperation;

import org.daniel.lungu.operation.Operation;
import org.daniel.lungu.operation.OperationFactory;
import org.daniel.lungu.operation.Operations;

/**
 * Double Operation factory
 *
 * @author Daniel Lungu
 */
public class DoubleOperationFactory implements OperationFactory {

	/**
	 * Crate the operation class for double input type, otherwise throw IllegalArgumentException.
	 *
	 * @param operation enum value from Operations
	 * @return the operation for the integer type
	 */
	@Override
	public Operation create(Operations operation) {
		if (operation == Operations.NEGATION) {
			return new NegateOperation();
		}
		throw new IllegalArgumentException("The operation is not supported by double values");
	}
}
