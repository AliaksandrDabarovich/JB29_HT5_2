package by.ad.les08_2;

import java.util.Random;

/*
 * 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
 * причем в каждом столбце число единиц равно номеру столбца. 
 */
public class Task34 {

	public static void main(String[] args) {
		int n;
		int m;

		n = 10;
		m = 10;

		int[][] arr = new int[n][m];
		arr = mas(arr);
		printArr(arr);
		System.out.println("--------------------------------------------------");

	}

	public static int[][] mas(int[][] arr) {
		int b;
		b = 0;
		for (int j = 0; j < arr[0].length; j++) {
			b = j;
			for (int i = 0; i < arr.length; i++) {
				
				if (b > 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
				b--;
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
