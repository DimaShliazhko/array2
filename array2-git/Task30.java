package by.htp.task.array2;
/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, в
	которых число 5 встречается три и более раз.
 * 
 */


public class Task30 {
	public static void main(String[] args) {

		
		int n;
		n = 10;
		int m;
		m = 20;

		int[][] arr = creatArr(n, m);
		printArr(arr);
		System.out.println();
		five(arr);

	}

	public static int[][] creatArr(int n, int m) {

		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (int) ((Math.random() * 15));

			}

		}

		return arr;
	}

	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "  \t ");

			}
			System.out.println();

		}
	}

	public static void five(int[][] arr) {
		int k;
		for (int i = 0; i < arr.length; i++) {
			k = 0;
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == 5) {
					k++;

				}

			}
			if (k >= 3) {
				System.out.println("в строке " + (i + 1) + "число 5 встречается " + k + " раз");
			}
		}

	}

}
