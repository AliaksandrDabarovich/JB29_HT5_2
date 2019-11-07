package by.ad.les08_2;

import java.util.Random;

/*
 * 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, в которых число 5 
 * встречается три и более раз. 
 */
public class Task30 {

	public static void main(String[] args) {
		int n;
		int m;
		
		
		
				
		n=10;
		m=20;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		piat(arr);
		
		}
		
		public static void piat(int[][]arr) {
			int sum;
			sum=0;
			for (int i=0; i<arr.length; i++) {
				for (int j=0;j<arr[i].length;j++) {
					if (arr[i][j]==5) {
						sum++;
						if(sum>=3) {
							System.out.println(i);
							break;
						}
					}
				}
				sum=0;
				
				
			}
			
		}
		
		public static int[][] mas(int[][]arr) {
			Random rand = new Random();
			for (int i=0; i<arr.length; i++) {
				for (int j=0;j<arr[i].length;j++) {
					arr[i][j]=rand.nextInt(15);
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
