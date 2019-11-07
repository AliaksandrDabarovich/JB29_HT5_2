package by.ad.les08_2;

import java.util.Random;

/*
 * 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: 
 * первая строка справа налево, 
 * вторая строка слева направо, третья строка справа налево и так далее. 
 */
public class Task11 {

	public static void main(String[] args) {
		int n;
		int m;
		
		
		
				
		n=5;
		m=5;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		System.out.println("-------------------------------------");
		calc(arr);

	}
	
public static void calc(int[][]arr) {
		
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				if (i==0||i%2==0) {
					
					System.out.print(arr[i][arr[i].length-1-j]+"\t");
				}else {System.out.print(arr[i][j]+"\t");
					
				}
					
				}
			System.out.println("\n");
				
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
