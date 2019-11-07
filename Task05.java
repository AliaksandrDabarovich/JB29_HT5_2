package by.ad.les08_2;

import java.util.Arrays;
import java.util.Random;

/*
 * 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами. 
 */
public class Task05 {

public static void main(String[] args) {
		
		int[][] arr = new int[7][7];
		arr=mas(arr);
		print(arr);
		
	}
	public static int [][] mas (int[][] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				
					arr[i][j] = rand.nextInt(10);
				
			}
		}
		return arr;
		
		
	}
	
	public static void print (int[][] arr) {
		System.out.println(Arrays.deepToString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i==0) {continue;}
				else if (i%2==0) {
					System.out.print(" "+arr[i][j]+" ");
				} 
				
			}
			System.out.println("\n");
		}
	}


}
