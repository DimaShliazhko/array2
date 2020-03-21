package by.htp.task.array2;

import java.util.Scanner;

/*
 * 28. Задана матрица неотрицательных чисел. 
 * Посчитать сумму элементов в каждом столбце. Определить, какой столбец
содержит максимальную сумму.
 * 
 */

public class Task28 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		int m;

		System.out.println("Введите размер массима");
		n = scanner.nextInt();
		m = scanner.nextInt();
		int[][] arr = creatArr(n, m);
		printArr(arr);
		int[] maxArr = maxArr(arr);
		printMax(maxArr);
		int max = max(maxArr);
		System.out.println("столец " + max + " содердит максимальную сумму");

	}

	public static int[][] creatArr(int n, int m) {

		int[][] arr = new int[n][m];

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

				System.out.print(arr[i][j] + "   ");

			}
			System.out.println();

		}
	}

	public static int[] maxArr(int[][] arr) {
		int[] sum = new int[arr.length];
		int sumСolumn;
		int Сolumn;
		int j = 0;

		for (int i = j; i < arr.length; i++) {

			sumСolumn = 0;
			Сolumn = 0;
			int k = 0;
			while (k != arr.length) {
				sumСolumn = sumСolumn + arr[k][j];
				k++;
			}
			sum[j] = sumСolumn;
			j++;
			// System.out.println("sumСolumn " + sumСolumn);

		}
		return sum;
	}

	public static void printMax(int[] max) {
		for (int i = 0; i < max.length; i++) {
			System.out.println(max[i]);
		}
	}

	public static int max(int[] maxArr) {
		int max;
		max = maxArr[0];
		int i;
		int maxi = 0;
		for (i = 0; i < maxArr.length; i++) {
			if (max < maxArr[i]) {
				max = maxArr[i];
				maxi = i;
			}
		}

		return maxi+1;
	}
}
