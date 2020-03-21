package by.htp.task.array2;
/*
 * 
 * cформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 * 
 * 1    2    3    ..  n
 * n   n-1   n-2......1
 * 1    2    3    ..  n
 * n   n-1   n-2......1
 */

public class Task13 {
	public static void main(String[] args) {
		int n;
		n = 6;

		int[][] arr = new int[n][n];

		int i = 0;
		while (i != arr.length) {
			if (i % 2 != 0) {
				for (int ii = i; ii < arr.length; ii =arr.length) {
					for (int j = arr[ii].length-1; j >=0; j --) {
						arr[ii][j] = j+1;
						System.out.print(arr[ii][j] + "   ");
					}

				}
				
			} else {
				for (int ii = i; ii < arr.length; ii = arr.length) {
					for (int j = 0; j < arr[ii].length; j++) {
						arr[ii][j] = j+1;
						System.out.print(arr[ii][j] + "   ");

					}
				}
			}
			i++;
			System.out.println();
		}
	}
}