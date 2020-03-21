package by.htp.task.array2;
/*
 * формировать квадратную матрицу порядка n по заданному образцу (n - четное)
 * n 0   0 ...0
 * 0 n-1 0....0
 * 0 0   n-2..0
 * 0 0   0 ...1
 */

public class Task15 {

	public static void main(String[] args) {
		int n;
		n = 5;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = n-i;
					// System.out.print(arr[i][j] + " ");

				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "   ");

			}
			System.out.println();

		}

	}

}
