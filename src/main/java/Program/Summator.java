package Program;

public class Summator {
	public void sumArray(int[][] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.printf("Сумма всех значений массива равна %d.", sum);
	}
}
