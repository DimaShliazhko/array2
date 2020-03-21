package by.htp.task.array2;
/*
 * 
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 *  причем в каждом столбце число
единиц равно номеру столбца.
 */

import java.util.Scanner;

public class Task34 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		int m;

		System.out.println("Введите размер массима");
		n = scanner.nextInt();
		m = scanner.nextInt();
		int[][] arr = creatArr(n, m);
		printArr(arr);

	}

	public static int[][] creatArr(int n, int m) {

		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (int) (Math.random() + 0.5);
				if (arr[i][j] ==1) {
					count++;
					System.out.print(count);
				}
				if (arr[i][j] == 1 && count == j+1) {
					arr[i][j] = 0;
				}

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

}
