package by.ad.les08_2;

import java.util.Random;

/*
 * 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него. 
 */
public class Task35 {

	public static void main(String[] args) {
		int n;
		int m;
		int max;

		n = 5;
		m = 5;

		int[][] arr = new int[n][m];
		arr = mas(arr);
		printArr(arr);
		max=calc(arr);
		System.out.println("-----------------------------------");
		change(arr, max);
		

	}
	
	public static void change(int [][]arr, int max) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				if (arr[i][j]<0) {
					arr[i][j]=max;
				}
			}
			
		}
		printArr(arr);
	}
	
	public static int[][] mas(int[][] arr) {
		Random rand = new Random();
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=rand.nextInt(20)-5;
			}
			
		}
		return arr;

	}
	
	public static int calc(int [][]arr) {
		int max;
		max=arr[0][0];
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				if (arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		return max;
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
