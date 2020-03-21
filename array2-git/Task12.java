package by.htp.task.array2;

/*
 * получить квадратныю матрицу порядка n
 * 0000
 * 0100
 * 0020
 * 00.(n-1)
 */
public class Task12 {
	public static void main(String[] args) {
		int n;
		n = 5;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = i;
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
