package org.daniel.lungu.operation;

/**
 * Operations enum
 *
 * @author Daniel Lungu
 */
public enum Operations {
	CAPITALIZE("capitalize"), REVERSE("reverse"), NEGATION("neg");

	private final String value;

	Operations(String value) {
		this.value = value;
	}

	/**
	 * Convert string value to an Operations enum value, otherwise throw IllegalArgumentException.
	 *
	 * @param text string value which should be one of the supported operation.
	 * @return an enum value
	 */
	public static Operations fromString(String text) {
		for (Operations b : Operations.values()) {
			if (b.value.equalsIgnoreCase(text)) {
				return b;
			}
		}
		throw new IllegalArgumentException("The operation is not supported!");
	}
}
