package by.ad.les08_2;

import java.util.Arrays;
import java.util.Random;

/*
 * 8. Дан двухмерный массив n×m элементов. 
 * Определить, сколько раз встречается число 7 среди элементов массива. 
 */
public class Task08 {

	public static void main(String[] args) {
		int n;
		int m;
		int sum;
		
		n=5;
		m=6;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		sum=calc(arr);
		print(sum);
	}
	
	public static int calc(int[][]arr) {
		int sum;
		sum=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				if (arr[i][j]==7) {
					
					sum++;
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
		System.out.println(Arrays.deepToString(arr));
	}
	public static void print(int a) {
		System.out.println(a);
	}

}
