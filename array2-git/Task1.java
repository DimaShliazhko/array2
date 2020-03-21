package by.htp.task.array2;
/*
 * создать матрицу 3*4, заполнить ее числами 0 и 1
 * так, чтобы в одной строке была ровно 1 единица и вывести на экран
 * 
 */

public class Task1 {
	public static void main(String[] args) {

		int[][] arr = new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = 1;

				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
