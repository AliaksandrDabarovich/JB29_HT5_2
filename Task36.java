package by.ad.les08_2;

import java.util.Random;

/*
 * 36. Операция сглаживания матрицы дает новую матрицу 
 * того же размера, каждый элемент которой получается 
 * как среднее арифметическое соседей соответствующего 
 * элемента исходной матрицы. Построить результат сглаживания 
 * заданной матрицы 
 */
public class Task36 {

	public static void main(String[] args) {
		int n;
		int m;
		int max;

		n = 5;
		m = 5;

		double[][] arr = new double[n][m];
		double[][] arrNew = arr;
		arr = mas(arr);
		printArr(arr);
		System.out.println("----------------------------------------------");
		calc(arr, arrNew);

	}

	public static void calc(double[][] arr, double[][] arrNew) {
		for (int i=1; i<arrNew.length-1;i++) {
			for(int j=1; j<arrNew[i].length-1;j++) {
				arrNew[i][j]=(arr[i-1][j]+arr[i+1][j]+arr[i][j-1]+arr[i][j+1])/4;
			}
		}
		printArr(arrNew);
		
		
	

	}

	public static double[][] mas(double[][] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
			}

		}
		return arr;

	}

	

	public static void printArr(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");

		}

}
}
