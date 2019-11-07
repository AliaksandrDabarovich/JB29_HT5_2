package by.ad.les08_2;

import java.util.Random;

/*
 * 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task32 {

	public static void main(String[] args) {
		
		int n;
		int m;
		
		
		
				
		n=3;
		m=5;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		System.out.println("--------------------------------------------------");
		sort(arr);
	}
	
	public static void sort(int[][]arr) {
		
		for (int i=0; i<arr.length; i++) {
			boolean needIteration = true;
			while (needIteration) {
				needIteration=false;
				for (int j=1;j<arr[i].length;j++) {
					if (arr[i][j]<arr[i][j-1]) {
						swap(arr, i,j, j-1);
						needIteration=true;
					}
				}
			}
			
			
		}
		printArr(arr);
		
			
		}
	
	public static void swap(int[][]arr,int i, int ind1, int ind2) {
		int tmp=arr[i][ind1];
		arr[i][ind1]=arr[i][ind2];
		arr[i][ind2]=tmp;
		
		
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
