package by.htp.task.array2;
/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn,
 *  составленная из чисел 1, 2, 3, ..., 2n
так, что суммы по каждому столбцу, каждой строке и каждой из двух 
больших диагоналей равны между собой.
Построить такой квадрат. Пример магического квадрата порядка 3:
 * 
 */

public class Task40 {
	public static void main(String[] args) {
		int n;
		n = 3;
		
		int[][] arr = new int[n][n];

		int magConst;
		magConst =  (n * (n*n + 1)) / 2;
		System.out.println(" magConst = "+magConst);
		arr[0][1] =1;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (int) ((Math.random() * n*n)+1);
				
				

			}
			System.out.println();
	}
		
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {

					System.out.print(arr[i][j] + " \t ");

				}
				System.out.println();

			}
			System.out.println();
		
		
	}
}
