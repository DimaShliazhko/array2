package by.htp.task.array2;
/*
 * С клавиатуры вводится двумерный массив чисел размерностью nxm.
 *  Выполнить с массивом следующие действия:
	а) вычислить сумму отрицательных элементов в каждой строке;
	б) определить максимальный элемент в каждой строке;
	в) переставить местами максимальный и минимальный элементы матрицы.
 * 
 */

import java.util.Scanner;

public class Task26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int m;

		System.out.println("Введите размер массима");
		n = scanner.nextInt();
		m = scanner.nextInt();
		int[][] arr = creatArr(n, m);
		printArr(arr);
		negative(arr);
		strMax(arr);
		int[][] arr1 = change(arr);
		printArr(arr1);

	}

	public static int[][] creatArr(int n, int m) {
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[n][m];
		System.out.println("введите элементы массива размерностью" + n + " на " + m);
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = scanner.nextInt();

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

	public static void negative(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			int sum;
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] < 0) {
					sum = sum + arr[i][j];
				}

			}
			System.out.println("в строке " + (i + 1) + " сумма отрицательных элементов равна " + sum);

		}

	}

	public static void strMax(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			int max;
			max = arr[0][0];
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] > max) {
					max = arr[i][j];
				}

			}
			System.out.println("в строке " + (i + 1) + " максимальный элемент  " + max);

		}
	}

	public static int[][] change(int[][] arr) {
		int max;
		int min;
		max = arr[0][0];
		min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] > max) {
					max = arr[i][j];
				} else if (arr[i][j] < min) {
					min = arr[i][j];
				}

			}

		}
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if ( arr[i][j] == max  ) {
					arr[i][j] = min;
					
				} else if (arr[i][j] == min) {
					arr[i][j]=max ;
				}

			}

		}
		
		return arr;
	}

}
