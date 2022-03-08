package org.daniel.lungu.operation.doubleoperation;

import java.util.Objects;
import org.daniel.lungu.operation.Operation;

/**
 * Negate operation for double input type
 *
 * @author Daniel Lungu
 */
class NegateOperation implements Operation {

	/**
	 * The method return the negative value of the input
	 *
	 * @param value not null double value
	 * @return the negative value of the input
	 */
	@Override
	public String handel(String value) {
		Objects.requireNonNull(value, "input can't be null!");

		double doubleValue = -Double.parseDouble(value);

		return Double.toString(doubleValue);
	}
}
