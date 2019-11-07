package by.ad.les08_2;

/*
 * 22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 */
public class Task22 {

	public static void main(String[] args) {
		int n;
		n = 6;
		int[][] arr = new int[n][n];
		arr = mas(arr, n);
		printArr(arr);

	}

	public static int[][] mas(int[][] arr, int n) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (j + 1+i > n) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = j + 1+i;
				}

			}

		}
		return arr;

	}

	/* ((j>=i)&&(j<=n-i+1)||(j<=i)&&(j>n-i)) */
	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");

		}
	}

}
