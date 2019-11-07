package by.ad.les08_2;
import java.util.Scanner;
/*
 * С клавиатуры вводится двумерный массив чисел размерностью nxm. 
 * Выполнить с массивом следующие действия: 
 *  а) вычислить сумму  * отрицательных элементов в каждой строке;  
 * б) определить максимальный элемент  * в каждой строке;  
 * в) переставить местами максимальный и минимальный элементы матрицы. 
 */
public class Task26 {

	public static void main(String[] args) {
		int n;
		int m;
		int [][] arr;
		
		n=2;
		m=2;
		arr= new int[n][m];
		arr=mas(arr);
		printArr(arr);
		otriz(arr);
		max(arr);
		shuffle(arr);
		
		
		
		
		

	}
	public static int[][] mas(int[][]arr){
		
		
		
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
							
						
				Scanner sc= new Scanner (System.in);
				System.out.println("Введите элемент >");
						while (sc.hasNextInt()==false) {
							sc.next();
							System.out.println("Введите месяц >");
						}
						arr[i][j] =sc.nextInt();
				
				
			}

		}
		return arr;
	}
	
	public static void shuffle (int[][]arr) {
		int max;
		int min;
		int time;
		int a;
		int b;
		int c;
		int d;
		for (int i = 0; i < arr.length; i++) {
			max=arr[i][0];
			min=arr[i][0];
			a=b=c=d=i;
			for (int j = 0; j < arr[i].length; j++) {
				if (max<arr[i][j]) {
					max=arr[i][j];
					a=i;
					b=j;
				}
				if (min>arr[i][j]) {
					min=arr[i][j];
					c=i;
					d=j;
				}
								
				
			}
			time=arr[a][b];
			arr[a][b]=arr[c][d];
			arr[c][d]=time;
			
			

		}
		printArr(arr);
	}
	
	public static void max (int[][]arr) {
		int max;
		for (int i = 0; i < arr.length; i++) {
			max=arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (max<arr[i][j]) {
					max=arr[i][j];
				}
								
				
			}
			System.out.println("Максимальный элемент в "+i+" строке: "+max);

		}
	}
	public static void otriz (int[][]arr) {
		int count;
		for (int i = 0; i < arr.length; i++) {
			count=0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]<0) {
					count++;
				}
								
				
			}
			System.out.println("Отрицательных элементов в "+i+" строке: "+count);

		}
	}
	
	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");

		}
	}

}
