package Program;

import Exceptions.ColumnConversionException;
import Exceptions.RowConversionException;

public class Checker {
	public void checkArray (int[][] array, int size) throws
		RowConversionException, ColumnConversionException {
		if (array.length !=size){
			RowConversionException e = new RowConversionException(
				String.valueOf(size),String.valueOf(array.length));
			throw e;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i].length !=size){
				ColumnConversionException e = new ColumnConversionException(
					String.valueOf(size),String.valueOf(array[i].length));
				throw e;
			}
		}
	}
}
