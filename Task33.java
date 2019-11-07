package by.ad.les08_2;

import java.util.Random;

/*
 * 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов. 
 */
public class Task33 {

	public static void main(String[] args) {
		int n;
		int m;
		
		
		
				
		n=5;
		m=3;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		System.out.println("--------------------------------------------------");
		sort(arr);

	}
	
	public static void sort(int [][]arr) {
		for (int j=0; j<arr[0].length; j++) {
			boolean needSort=true;
			while (needSort) {
				needSort=false;
				for (int i=1;i<arr.length;i++) {
					if(arr[i][j]<arr[i-1][j]) {
						swap(arr, j, i, i-1);
						needSort=true;
					}
				}
			}
		}
		
		printArr(arr);
		
		
		
		
		
	}
	
	public static void swap(int[][]arr,int j, int ind1, int ind2) {
		int tmp=arr[ind1][j];
		arr[ind1][j]=arr[ind2][j];
		arr[ind2][j]=tmp;
		
		
	}
		
	
	
	public static int[][] mas(int[][]arr) {
		Random rand = new Random();
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=rand.nextInt(100);
			}
			
		}
		return arr;
		
	}
	
	public static void print(int a) {
		System.out.println(a);
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
