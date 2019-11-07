package by.ad.les08_2;

import java.util.Random;

/*
 * 29. Найти положительные элементы главной диагонали квадратной матрицы
 */
public class Task29 {

	public static void main(String[] args) {
		int n;
		int m;
		
		
		
				
		n=4;
		m=4;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		poloz(arr);
		
	}
	
	public static void poloz(int[][]arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				if (i==j&&arr[i][j]>0) {
					System.out.println(arr[i][j]);
				}
			}
			
			
		}
		
	}
	
	public static int[][] mas(int[][]arr) {
		Random rand = new Random();
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=rand.nextInt(10)-2;
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
