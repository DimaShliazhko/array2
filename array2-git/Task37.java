package by.htp.task.array2;
/*
 * 37. Переставить строки матрицы случайным образом.
 * 
 */

import java.util.Scanner;

public class Task37 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		int m;

		System.out.println("Введите размер массима");
		n = scanner.nextInt();
		m = scanner.nextInt();
		int[][] arr = creatArr(n, m);
		printArr(arr);
		arr = changeArr(arr);
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
	}

	public static int[][] changeArr(int[][] arr) {
		int n1;
		int n2;
		do {
			n1 = (int) (Math.random() * arr.length);
			n2 = (int) (Math.random() * arr.length);

		} while (n1 == n2);

		System.out.println("n1 =" + n1 + " n2 = " + n2);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i == n1) {
					int temp;
					temp = arr[i][j];
					arr[i][j] = arr[i + n2][j];
					arr[i + n2][j] = temp;

				}

			}

		}
		return arr;
	}

}
