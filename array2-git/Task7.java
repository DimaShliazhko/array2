package by.htp.task.array2;

/*
 * дан двумерный массив 5*5. наити сумму модулей отрицательных нечетных элементов
 * 
 */
public class Task7 {
	public static void main(String[] args) {
		/// иходная матрица
		int[][] arr = new int[5][5];
		int sum;
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) ((Math.random() * 30) - 15);
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0 && arr[i][j] < 0) {
					System.out.println(arr[i][j]);
					sum = sum + Math.abs(arr[i][j]);

				}

			}

		}
		System.out.println("сумма равна = " + sum);
		System.out.println();
	}
}