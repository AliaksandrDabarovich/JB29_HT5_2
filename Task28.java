package by.ad.les08_2;

import java.util.Random;

/*
 * 28. Задана матрица неотрицательных чисел. Посчитать 
 * сумму элементов в каждом столбце. Определить, какой 
 * столбец содержит максимальную сумму. 
 */
public class Task28 {

	public static void main(String[] args) {
		int n;
		int m;
		
		
		
				
		n=4;
		m=3;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		sum(arr);

	}
	
	public static void sum(int[][]arr) {
		int sum;
		int max;
		int index;
		
		index=0;
		max=0;
		sum=0;
		
		for (int j=0;j<arr[j].length;j++) {
			for (int i=0;i<arr.length;i++) {
				sum+=arr[i][j];
			}
			if(max<sum) {
				max=sum;
				index=j;
			}
			System.out.println("Столбец "+j+" : "+sum);
			sum=0;
		}
		System.out.println("максимальная сумма в столбце "+index);
		
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

}
