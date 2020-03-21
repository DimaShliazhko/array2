package by.htp.task.array2;
/*
 * создать и вывести матрицу 2*3 заполнеными случайными числами [0.9]
 * 
 */

public class Task2 {
	
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		for (int i = 0 ;i < arr.length ;i++) {
			for (int j = 0 ;j < arr[i].length ;j++) {
				arr[i][j] = (int) (Math.random()*10); 
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
