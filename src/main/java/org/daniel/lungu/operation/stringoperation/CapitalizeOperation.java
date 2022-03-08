package org.daniel.lungu.operation.stringoperation;

import java.util.Locale;
import java.util.Objects;
import org.daniel.lungu.operation.Operation;

/**
 * Capitalize operation for sting input type
 *
 * @author Daniel Lungu
 */
class CapitalizeOperation implements Operation {

	/**
	 * Capitalizes a string element.
	 *
	 * @param value not null string value
	 * @return a capitalize string
	 */
	@Override
	public String handel(String value) {
		Objects.requireNonNull(value, "Input can't be null!");

		return value.toUpperCase(Locale.ROOT);
	}
}
