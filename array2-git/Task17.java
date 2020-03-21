package by.htp.task.array2;

/*
 * 
 * * cформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 */
public class Task17 {

	public static void main(String[] args) {
		int n;
		n = 5;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr.length - 1) {
					arr[i][j] = 1;
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
