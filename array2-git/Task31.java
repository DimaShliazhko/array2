package by.htp.task.array2;
/*
 * 
 * Сформировать матрицу из чисел от 0 до 999,
 *  вывести ее на экран. Посчитать количество двузначных чисел в ней.
 */

public class Task31 {
	public static void main(String[] args) {

		int n;
		n = 100;
		int m;
		m = 10;

		int[][] arr = creatArr(n, m);
		printArr(arr);
		System.out.println();
		coutn(arr);

	}

	public static int[][] creatArr(int n, int m) {

		int[][] arr = new int[n][m];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = count++;

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

	public static void coutn(int[][] arr) {
		int coutn;
		coutn = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] >= 10 && arr[i][j] <= 99) {
					coutn++;
				}
			}

		}
System.out.println("количество двузначных чисел "+coutn);
	}

}
