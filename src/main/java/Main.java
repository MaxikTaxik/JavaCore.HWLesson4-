import Exceptions.ColumnConversionException;
import Exceptions.RowConversionException;
import Program.Checker;
import Program.Summator;

public class Main {
	public static void main(String[] args) {
		int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		try {
			Checker checker = new Checker();
			Summator summator = new Summator();
			checker.checkArray(array, 5);
			summator.sumArray(array);
		} catch (RowConversionException e) {
			throw new RuntimeException(e);
		} catch (ColumnConversionException e) {
			throw new RuntimeException(e);
		}
	}
}
