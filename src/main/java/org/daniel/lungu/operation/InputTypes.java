package org.daniel.lungu.operation;

/**
 * Input Type enum
 *
 * @author Daniel Lungu
 */
public enum InputTypes {
	STRING("string"), INTEGER("int"), DOUBLE("double");

	private final String value;

	InputTypes(String value) {
		this.value = value;
	}

	/**
	 * Convert string value to an InputTypes enum value, otherwise throw IllegalArgumentException.
	 *
	 * @param text string value which should be one of the supported input type.
	 * @return an enum value
	 */
	public static InputTypes fromString(String text) {
		for (InputTypes b : InputTypes.values()) {
			if (b.value.equalsIgnoreCase(text)) {
				return b;
			}
		}
		throw new IllegalArgumentException("The input type is not supported!");
	}
}
