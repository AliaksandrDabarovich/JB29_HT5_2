package by.ad.les08_2;
/*
 * 21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 */
public class Task21 {

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

				if (i>=j) {
					arr[i][j] = n-i+j;
				} else {
					arr[i][j] = 0;
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
