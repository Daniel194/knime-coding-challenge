package org.daniel.lungu.operation.stringoperation;

import java.util.Objects;
import org.daniel.lungu.operation.Operation;

/**
 * Reverse operation for sting input type
 *
 * @author Daniel Lungu
 */
class ReverseOperation implements Operation {

	/**
	 * The method return the revert version of the input
	 *
	 * @param value not null string value
	 * @return the revert value
	 */
	@Override
	public String handel(String value) {
		Objects.requireNonNull(value, "Input can't be null!");

		return new StringBuilder(value).reverse().toString();
	}
}
