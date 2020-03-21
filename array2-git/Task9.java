package by.htp.task.array2;
/*
 * 
 * дана квадратная матрица
 * вывести на экран элементы, стоящие на диагонали
 */

public class Task9 {

	public static void main(String[] args) {
		/// иходная матрица
	
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					
					
					System.out.println("элементы стоящие на диогонали "+arr[i][j]);
				}

			}

		}
		
		System.out.println();
	}
}

