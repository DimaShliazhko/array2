package by.htp.task.array2;
/*
 * cформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 * 
 * 0 .......001
 * 0........020
 *.
 *.
 *n.........000
 *
 */

public class Task14 {
	public static void main(String[] args) {
		int n;
		n = 5;

		int[][] arr = new int[n][n];

		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = arr[i].length-1; j >= 0; j--) {
				if (j == (arr.length-1)-i) {
					arr[i][j] = n-i;
					//System.out.println("i=" +i);
					//System.out.println("j=" +j);
					// System.out.print(arr[i][j] + " ");

				}
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		

	}

}
