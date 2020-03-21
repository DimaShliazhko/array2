package by.htp.task.array2;
/*
 * 
 * Найдите произведение двух матриц.
 */

import java.util.Scanner;

public class Task39 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n1;
		int m;
		int m2;

		System.out.println("Введитеразмер 1-ого массима");
		n1 = scanner.nextInt();
		m = scanner.nextInt();
		System.out.println("Введите количество столбцов 2-ого массима");
		m2 = scanner.nextInt();

		int[][] arr1 = creatArr(n1, m);
		int[][] arr2 = creatArr(m, m2);
		printArr(arr1);
		printArr(arr2);
		int[][] arr = compArr(arr1, arr2, n1, m2);
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

				System.out.print(arr[i][j] + " \t ");

			}
			System.out.println();

		}
		System.out.println();
	}

	public static int[][] compArr(int[][] arr1, int[][] arr2, int n, int m) {
		int[][] arr = new int[n][m];

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2[i].length; j++) {
				arr[i][j] = 0;
				for (int k = 0; k < arr1[i].length; k++)
					arr[i][j] += arr1[i][k] * arr2[k][j];
			}
		}
		return arr;
	}

}
