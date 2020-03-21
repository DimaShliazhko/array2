package by.htp.task.array2;
/*
 * 
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		int m;

		System.out.println("Введите размер массима");
		n = scanner.nextInt();
		m = scanner.nextInt();
		int[][] arr = creatArr(n, m);
		printArr(arr);
		int max = searchMax(arr);
		System.out.println("max = " + max);
		arr = change(arr,max);
		printArr(arr);

	}

	public static int[][] creatArr(int n, int m) {

		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (int) (Math.random() * 10);

			}
			System.out.println();

		}

		return arr;
	}

	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "   ");

			}
			System.out.println();

		}
	}

	public static int searchMax(int[][] arr) {
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] > max) {
					max = arr[i][j];

				}
			}
		}
		return max;
	}
	public static int[][] change(int[][] arr, int max) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] % 2 != 0 ) {
					arr[i][j] = max;

				}
			}
		}
		return arr;
	}

}
