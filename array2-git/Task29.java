package by.htp.task.array2;
/*
 * 
 * Найти положительные элементы главной диагонали квадратной матрицы.
 * 
 */

import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;

		System.out.println("Введите размер массима");
		n = scanner.nextInt();

		int[][] arr = creatArr(n);
		printArr(arr);
		System.out.println();
		plusEl(arr);

	}

	public static int[][] creatArr(int n) {

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (int) ((Math.random() * 30) - 15);

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

	public static void plusEl(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i == j && arr[i][j] > 0) {
					System.out.print(arr[i][j] + " ");
				}
			}

		}

	}

}