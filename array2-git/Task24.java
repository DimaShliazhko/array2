package by.htp.task.array2;
/*
 * дан линейный массив 
 * x1,x2,x3,x4....
 * получить действительную квадратную матрицу порядка n
 */

public class Task24 {
	public static void main(String[] args) {
		int n = 5;
		int[] arr = new int[n];
		int[][] arr1 = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = (int) Math.pow(arr[j], i+1);
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
