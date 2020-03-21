package by.htp.task.array2;
/*
 *cформировать квадратную матрицу порядка n по заданному образцу (n - четное) 
 */

public class Task20 {

	public static void main(String[] args) {
		int n;
		n = 6;

		int[][] arr = new int[n][n];
		int j;

		for (int i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {

				arr[i][j] = 1;

			}

		}
		for (int i = 0; i <= arr.length / 2; i++) {

			for (j = i; j < arr[i].length - i; j++) {
				// System.out.println(j);
				arr[i][j] = 0;

			}
		}

		for (int i = arr.length - 1; i >= arr.length / 2; i--) {

			for (j = i; j >= arr[i].length - 1 - i; j--) {

				arr[i][j] = 0;

			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "   ");

			}
			System.out.println();

		}

	}

}