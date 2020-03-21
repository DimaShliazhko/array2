package by.htp.task.array2;
/*
 * 38. Найдите сумму двух матриц
 * 
 */

import java.util.Scanner;

public class Task38 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		int m;

		System.out.println("Введите размер массима");
		n = scanner.nextInt();
		m = scanner.nextInt();
		int[][] arr1 = creatArr(n, m);
		int[][] arr2 = creatArr(n, m);
		printArr(arr1);
		printArr(arr2);
		arr1 = sumArr(arr1, arr2);
		printArr(arr1);

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

	public static int[][] sumArr(int[][] arr1, int[][] arr2) {

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return arr1;
	}

}
