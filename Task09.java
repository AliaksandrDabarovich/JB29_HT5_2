package by.ad.les08_2;

import java.util.Arrays;
import java.util.Random;

/*
 * 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task09 {

	public static void main(String[] args) {
		int n;
		int m;
		int sum;
		
		n=5;
		m=5;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		calc(arr);
		

	}
	public static int calc(int[][]arr) {
		int sum;
		sum=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				if (i==j) {
					print(arr[i][j]);
					
				}
			}
			
			
		}
		return sum;
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
