package by.htp.task.array2;
/*
 * 
 * дан двумерный массив n*m элементов
 * определить сколько раз встречается число 7 среди элементов массива
 */

public class Task8 {

	public static void main(String[] args) {
		/// иходная матрица
		int n;
		int m;
		n = 5;
		m = 6;
		int count;
		count = 0;
		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 7) {
					count++;
					

				}

			}

		}
		System.out.println("число 7 повторяется " + count+" раз");
		System.out.println();
	}
}
