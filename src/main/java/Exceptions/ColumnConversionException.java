package Exceptions;

public class ColumnConversionException extends Exception {
	public ColumnConversionException(String expected, String actual) {
		super(String.format("Ошибка преобразования столбца: ожидалось '%s', получено '%s'", expected, actual));
	}
}
