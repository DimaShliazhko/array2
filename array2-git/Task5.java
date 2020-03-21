package by.htp.task.array2;
/*
 * дана матрица. вывести на экран все четные строки
 * , то есть с четными номерами
 * 
 */

public class Task5 {
	public static void main(String[] args) {
		///иходная матрица
		int[][] arr = new int[6][6];
		for (int i = 0 ;i < arr.length ;i++) {
			for (int j = 0 ;j < arr[i].length ;j++) {
				arr[i][j] = (int) (Math.random()*10); 
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	
		/// выводим строки с четными номерами
		for (int i = 0 ;i < arr.length ;i= i+2) {
			for (int j = 0 ;j < arr[i].length ;j++) {
				
				 
				System.out.print(arr[i][j]);
			
			}
			System.out.println();
	}
	

}


}
