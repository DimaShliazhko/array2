package by.htp.task.array2;
/*
 * 
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task33 {
	public static void main(String[] args) {

		int n;
		n = 4;

		int[][] arr = creatArr(n);
		printArr(arr);
		System.out.println();
		int[][] minArr = sortmin(arr);
		System.out.println("сортировка по возрастанию");
		printArr(minArr);
		System.out.println("сортировка по убыванию");
		int[][] maxArr = sortmax(arr);
		printArr(maxArr);
	}

	public static int[][] creatArr(int n) {

		int[][] arr = new int[n][n];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (int) (Math.random() * 10);

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

	public static int[][] sortmin(int[][] arr) {

		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length - 1; i++) {
				for (int k = 0; k < arr.length - i - 1; k++)

					if (arr[k][j] > arr[k + 1][j]) {
						int temp;
						temp = arr[k][j];
						arr[k][j] = arr[k + 1][j];
						arr[k + 1][j] = temp;
					}
			}

		}
		return arr;
	}

	public static int[][] sortmax(int[][] arr) {

		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length - 1; i++) {
				for (int k = 0; k < arr.length - i - 1; k++)

					if (arr[k][j] < arr[k + 1][j]) {
						int temp;
						temp = arr[k][j];
						arr[k][j] = arr[k + 1][j];
						arr[k + 1][j] = temp;
					}
			}

		}
		return arr;
	}

	
	
	
}
