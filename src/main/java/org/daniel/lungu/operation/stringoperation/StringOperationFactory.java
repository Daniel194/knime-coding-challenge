package org.daniel.lungu.operation.stringoperation;

import org.daniel.lungu.operation.Operation;
import org.daniel.lungu.operation.OperationFactory;
import org.daniel.lungu.operation.Operations;

/**
 * String Operation factory
 *
 * @author Daniel Lungu
 */
public class StringOperationFactory implements OperationFactory {

	/**
	 * Crate the operation class for string input type, otherwise throw IllegalArgumentException.
	 *
	 * @param operation enum value from Operations
	 * @return the operation for the string type
	 */
	@Override
	public Operation create(Operations operation) {
		switch (operation) {
			case CAPITALIZE -> {
				return new CapitalizeOperation();
			}
			case REVERSE -> {
				return new ReverseOperation();
			}
			default -> throw new IllegalArgumentException("The operation is not supported by string values");
		}
	}
}
