package by.ad.les08_2;

import java.util.Random;

/*37. Переставить строки матрицы случайным образом
 * 
 */
public class Task37 {

	public static void main(String[] args) {
		int n;
		int m;
		
		
		
				
		n=5;
		m=3;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		System.out.println("---------------------------------------------------");
		change(arr,n);

	}
	
	public static void change(int [][]arr, int n) {
		int []time=new int [n];
		Random rand=new Random();
		
		for (int i=0; i<arr.length; i++) {
			int t=rand.nextInt(n-1);
			time=arr[i];			
			arr[i]=arr[t];
			arr[t]=time;
			
		}
		printArr(arr);
		
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
	
	
	
	public static void printArr(int[][]arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
			
		}
	}

}
