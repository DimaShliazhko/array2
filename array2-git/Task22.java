package by.htp.task.array2;
/*
 *  cформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 * 
 */

public class Task22 {

	public static void main(String[] args) {
		int n;
		n = 6;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = arr[i].length-1-i; j >= 0; j--) {

				arr[i][j] = (j+1)+i;
				// System.out.print(arr[i][j] + " ");

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
