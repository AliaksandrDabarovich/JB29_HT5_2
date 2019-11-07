package by.ad.les08_2;

import java.util.Random;

/*
 * 
 38. Найдите сумму двух матриц 
 */
public class Task38 {

	public static void main(String[] args) {
		int n;
		int m;
			
				
		n=5;
		m=3;
		
		
		int arr2[][]=new int[n][m];
		int[][] arr = new int[n][m];
		arr=mas(arr);
		arr2=mas(arr2);
		printArr(arr);
		System.out.println("---------------------------------------------------");
		printArr(arr2);
		System.out.println("---------------------------------------------------");
		
		int [][]arr3=sum(arr,arr2,n,m);
		printArr(arr3);
	}
	
	public static int[][] sum(int [][]arr, int [][]arr2, int n, int m) {
		int [][]arr3=new int[n][m];
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr3[i][j]=arr[i][j]+arr2[i][j];
			}
			
		}
		return arr3;
		
	}
	
	public static int[][] mas(int[][]arr) {
		Random rand = new Random();
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=rand.nextInt(20);
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

}
