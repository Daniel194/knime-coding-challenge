package org.daniel.lungu.operation.integeroperation;

import java.util.Objects;
import org.daniel.lungu.operation.Operation;

/**
 * Negate operation for integer input type
 *
 * @author Daniel Lungu
 */
class NegateOperation implements Operation {

	/**
	 * The method return the negative value of the input
	 *
	 * @param value not null integer value
	 * @return the negative value of the input
	 */
	@Override
	public String handel(String value) {
		Objects.requireNonNull(value, "input can't be null!");

		int intValue = -Integer.parseInt(value);

		return Integer.toString(intValue);
	}
}
