package by.htp.task.array2;
/*
 * 
 * сформировать квадратную матрицу порядка n по правилу
 * a[i][j] = sin ((i*i - j*j) / n )
 *  и подсчитать количество положительных элементов в ней
 **/

public class Task23 {

	public static void main(String[] args) {
		int n;
		n = 5;
		int k;
		k = 0;

		double[][] arr = new double[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
					arr[i][j] = Math.sin((i*i - j*j) / n);
					if (arr[i][j] > 0) {
						k++;
					}
					
			}
			

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "   ");

			}
			System.out.println();

		}
		System.out.println("количество положительных элементов "+k);

	}

}

