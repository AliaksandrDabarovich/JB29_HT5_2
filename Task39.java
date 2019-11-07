package by.ad.les08_2;

import java.util.Random;

/*39. Найдите произведение двух матриц. 
 * 
 */

public class Task39 {

	public static void main(String[] args) {
		int n;
		int m;
		int l;

		n = 2;
		m = 2;
		l = 3;

		int[][] arr = new int[n][m];
		int arr2[][] = new int[m][l];

		int arr3[][] = new int[n][l];

		mas(arr);
		mas(arr2);

		printArr(arr);
		System.out.println("---------------------------------------------------");
		printArr(arr2);
		count(arr, arr2, arr3);
		System.out.println("---------------------------------------------------");
		printArr(arr3);
	}

	public static int[][] count(int[][] arr, int[][] arr2, int[][] arr3) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				for (int k = 0; k < arr2.length; k++) {
					arr3[i][j] += arr[i][k] * arr2[k][j];
				}
			}
		}
		return arr3;

	}

	public static int[][] mas(int[][] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(5) + 1;
			}

		}
		return arr;

	}

	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");

		}
	}
}
