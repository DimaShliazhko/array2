package by.htp.task.array2;

import java.util.Scanner;

/*
 *36. Операция сглаживания матрицы дает новую матрицу того же размера,
 * каждый элемент которой получается
как среднее арифметическое соседей соответствующего элемента исходной матрицы. 
Построить результат
сглаживания заданной матрицы 
 * 
 */

public class Task36 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		int m;

		System.out.println("Введите размер массима");
		n = scanner.nextInt();
		m = scanner.nextInt();
		int[][] arr = creatArr(n, m);
		printArr(arr);
		double[][] arr2 = creatArr2(arr, n, m);
		printArr(arr2);

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
	public static void printArr(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " \t ");

			}
			System.out.println();

		}
	}

	public static double[][] creatArr2(int[][] arr, int n, int m) {

		double[][] arr2 = new double[n][m];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length ; j++) {

				if (j == arr[i].length - 1) {
					arr2[i][j] = (arr[i][j - 1] + arr[i][j]) / 2.0;

				} else if (j == 0) {
					arr2[i][j] = (arr[i][j] + arr[i][j + 1]) / 2.0;

				} else if ( j != 0 && j != arr[i].length - 1){
					arr2[i][j] = (arr[i][j - 1] + arr[i][j + 1]) / 2.0;
				}
			}
			System.out.println();

		}

		return arr2;
	}

}
