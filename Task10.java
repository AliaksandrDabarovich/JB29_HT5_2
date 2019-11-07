package by.ad.les08_2;

import java.util.Random;

/*
 * 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы. 
 */
public class Task10 {

	public static void main(String[] args) {
		int n;
		int m;
		int sum;
		int k;
		int p;
		
		k=3;
		p=1;		
		n=5;
		m=5;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		calc(arr, k, p);

	}
	public static void calc(int[][]arr, int k, int p) {
		
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				if (i==k) {
					print(arr[i][j]);
					
				}
				
			}
			
			
		}
		System.out.println("\n");
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				
				if (j==p) {
					print(arr[i][j]);
				}
			}
			
			
		}
		
	}
	
	public static int[][] mas(int[][]arr) {
		Random rand = new Random();
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=rand.nextInt(10);
			}
			
		}
		return arr;
		
	}
	
	public static void printArr(int[][]arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
			
		}
	}
	public static void print(int a) {
		System.out.println(a);
	}

}
