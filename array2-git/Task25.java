package by.htp.task.array2;
/*
 * 
 * получить квадратную матрицу порядка n
 * 
 */
public class Task25 {
	
public static void main(String[] args) {
	int n;
	n = 4;
	int a;
	a = 1; 
	int[][] arr = new int[n][n];

	for (int i = 0; i < arr.length; i++) {
		
		for (int j = 0; j < arr[i].length; j++) {

			arr[i][j] =a++; 
			// System.out.print(arr[i][j] + " ");

		}

	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {

			System.out.print(arr[i][j] + "\t");

		}
		System.out.println();

	}

}

}

