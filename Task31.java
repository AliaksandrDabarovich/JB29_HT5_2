package by.ad.les08_2;

import java.util.Random;

/*
 * 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. 
 * Посчитать количество двузначных чисел в ней.
 */
public class Task31 {

	public static void main(String[] args) {
		int n;
		int m;
		
		
		
				
		n=3;
		m=3;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		dvuznach(arr);

	}
	
	public static void dvuznach(int[][]arr) {
		int sum;
		int a;
		int b;
		
		b=0;
		sum=0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				a=arr[i][j];
				while (a>0) {
					b++;
					a/=10;
				}
				
				if (b==2) {
					sum++;
				}
				b=0;
				
				}
			}
		
			print (sum);
			
			
		}
		
	
	
	public static int[][] mas(int[][]arr) {
		Random rand = new Random();
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=rand.nextInt(999);
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
