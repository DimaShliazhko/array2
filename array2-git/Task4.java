package by.htp.task.array2;
/*
 * дана матрица. вывести на экран первый и последюю строки
 * 
 */

public class Task4 {
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
			System.out.println();
			/// выводим первый и последний строки
			for (int i = 0 ;i < arr.length ;i++) {
				for (int j = 0 ;j < arr[i].length ;j++) {
					if (i == 0 || i == arr.length-1) {
				
					System.out.print(arr[i][j]);
				}
					
				}
				System.out.println();
				
		}
		

	}

	}


