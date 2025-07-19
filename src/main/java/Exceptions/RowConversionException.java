package Exceptions;

public class RowConversionException extends Exception {
	public RowConversionException(String expected, String actual) {
		super(String.format("Ошибка преобразования строки: ожидалось '%s', получено '%s'", expected, actual));
	}
}
