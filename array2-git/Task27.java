package by.htp.task.array2;
/*
 * 27. В числовой матрице поменять местами два столбца любых столбца, 
 * т. е. все элементы одного столбца поставить на
соответствующие им позиции другого, а его элементы второго переместить в первый.
 Номера столбцов вводит
пользователь с клавиатуры.
 * 
 */

import java.util.Scanner;

public class Task27 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		int m;
		int m1;
		int m2;

		System.out.println("Введите размер массима");
		n = scanner.nextInt();
		m = scanner.nextInt();
		int[][] arr = creatArr(n, m);
		printArr(arr);
		System.out.println("поменять местами столбцы");
		m1 = (scanner.nextInt() - 1);
		m2 = (scanner.nextInt()) - 1;
		arr = change(arr, m1, m2);
		printArr(arr);

	}

	public static int[][] creatArr(int n, int m) {

		int[][] arr = new int[n][m];
		System.out.println("введите элементы массива размерностью" + n + " на " + m);
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

	public static int[][] change(int[][] arr, int m1, int m2) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == m1) {
					int temp;
					temp = arr[i][j];
					arr[i][j] = arr[i][m2];
					arr[i][m2] = temp;

				}
			}

		}
		return arr;

	}

}
