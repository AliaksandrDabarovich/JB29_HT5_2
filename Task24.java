package by.ad.les08_2;
import java.util.Random;
import java.util.Arrays;
/*
 * 24. Дан линейный массив n n x xxx ,,,, 1 21 − .
 *  Получить действительную квадратную матрицу порядка n: 
 */
public class Task24 {

	public static void main(String[] args) {
		int n;
		int []xarr;
		double[][] arr;
		
		n=5;
		arr = new double[n][n];
		xarr=new int[n];
		xarr=input(xarr);
		printXarr(xarr);
		arr = mas(arr, n,xarr);
		printArr(arr);
		

	}
	
	public static int[] input(int[]xarr) {
		Random rand=new Random();
		for (int i=0; i<xarr.length;i++) {
			xarr[i]=rand.nextInt(8);
		}
		return xarr;
	}
	
	
	
	public static double[][] mas(double[][] arr, int n, int []xarr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j]=Math.pow(xarr[j], i+1);

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
	public static void printXarr(int[] xarr) {
		System.out.println(Arrays.toString(xarr));
	}
}
