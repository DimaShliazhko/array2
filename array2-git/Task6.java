package by.htp.task.array2;

/*
 * 
 * дана матрица вывести на экран все нечетные столбцы, у которых первый элемент
 * больше последнегоо 
 */
public class Task6 {
	public static void main(String[] args) {
		/// иходная матрица
		int[][] arr = new int[6][6];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr[0].length; i = i + 2) {
			if (arr[0][i] > arr[arr.length - 1][i]) {
				for (int k = i; k < arr[0].length; k++) {

					for (int j = 0; j < arr.length; j++) {
						System.out.print(arr[j][k]);
					}
					k = arr[0].length + 2;// переполним k для выхода из цикла
					System.out.println();
				}
			}

		}

	}
}
