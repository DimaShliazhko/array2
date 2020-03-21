package by.htp.task.array2;
/*
 * 
 * дана матрица
 * вывести k- ю строку и p-й столбец матрицы
 */

public class Task10 {

	public static void main(String[] args) {
		/// иходная матрица
		int k;
		int p;
		k = 3;
		p = 3;
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == k) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println("элементы " + k + " строки " + arr[k-1][j]);
				}
				System.out.println();
			}
		}
		for (int j = 0; j < arr[0].length; j++) {
			if (j == p) {
				for (int i = 0; i < arr.length; i++) {
					System.out.println("элементы " + p + " столбца " + arr[i][p-1]);
				}

			}

		}
	}
}
