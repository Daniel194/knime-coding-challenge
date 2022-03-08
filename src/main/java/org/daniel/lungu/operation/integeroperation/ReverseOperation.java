package org.daniel.lungu.operation.integeroperation;

import java.util.Objects;
import org.daniel.lungu.operation.Operation;

/**
 * Reverse operation for integer input type
 *
 * @author Daniel Lungu
 */
class ReverseOperation implements Operation {

	/**
	 * The method return the revert version of the input
	 *
	 * @param value not null integer value
	 * @return the revert value
	 */
	@Override
	public String handel(String value) {
		Objects.requireNonNull(value, "Input can't be null!");

		int number = Integer.parseInt(value);
		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		return Integer.toString(reverse);
	}
}
