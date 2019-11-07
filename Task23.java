package by.ad.les08_2;
/*
 * 23. Сформировать квадратную матрицу порядка N по правилу:
 * и подсчитать количество положительных элементов в ней. 
 */

public class Task23 {

	public static void main(String[] args) {
		int n;
		n = 6;
		double[][] arr = new double[n][n];
		arr = mas(arr, n);
		printArr(arr);
		calc(arr);

	}

	public static double[][] mas(double[][] arr, int n) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Math.sin((i * i - j * j) / n);

			}

		}
		return arr;

	}

	public static void calc(double[][] arr) {
		int sum;
		sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]>0) {
					sum++;
				}
				
			}
			

		}
		print(sum);
		
	}

	/* ((j>=i)&&(j<=n-i+1)||(j<=i)&&(j>n-i)) */
	public static void printArr(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");

		}
	}
	public static void print(int a) {
		System.out.println(a);
	}

}
