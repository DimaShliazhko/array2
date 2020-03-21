package by.htp.task.array2;

/*
 *дана матрица размера m*n
 *вывести ее элементы в следующем порядке
 *первая строка справа налево
 *вторая сторока слева на право
 *третья строка справа налево и т.д. 
 * 
 */
public class task11 {

	public static void main(String[] args) {
		/// иходная матрица
		int n;
		int m;
		n = 5;
		m = 6;

		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		int i = 0;
		while (i != arr.length) {
			if (i % 2 == 0) {
				for (int ii = i; ii < arr.length; ii =arr.length) {
					for (int j = arr[ii].length-1; j >=0; j --) {

						System.out.print(arr[ii][j] + "   ");
					}

				}
				
			} else {
				for (int ii = i; ii < arr.length; ii = arr.length) {
					for (int j = 0; j < arr[ii].length; j++) {

						System.out.print(arr[ii][j] + "   ");

					}
				}
			}
			i++;
			System.out.println();
		}
	}
}
