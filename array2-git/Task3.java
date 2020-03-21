package by.htp.task.array2;
/*
 * 
 * дана матрица. вывести на экран первый и последний столбцы
 */

public class Task3 {
	public static void main(String[] args) {
		///иходная матрица
		int[][] arr = new int[4][5];
		for (int i = 0 ;i < arr.length ;i++) {
			for (int j = 0 ;j < arr[i].length ;j++) {
				arr[i][j] = (int) (Math.random()*10); 
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		/// выводим первый и последний столбец
		for (int i = 0 ;i < arr.length ;i++) {
			for (int j = 0 ;j < arr[i].length ;j++) {
				if (j == 0 || j == arr[i].length-1) {
			
				 
				System.out.print(arr[i][j]);
			}
			}
			System.out.println();
	}
	

}

}
