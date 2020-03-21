package by.htp.task.array2;
/*
 * 
 * cформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 */

public class Task16 {

public static void main(String[] args) {
	int n;
	n = 5;

	int[][] arr = new int[n][n];

	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if (i == j ) {
				arr[i][j] = (i+1)*(i+2);
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
