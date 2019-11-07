package by.ad.les08_2;

import java.util.Arrays;
import java.util.Random;

/*7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов. 
 * 
 */
public class Task07 {

	public static void main(String[] args) {
		
		int n;
		int sum;
		n=5;
		
		int[][] arr = new int[n][n];
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
				if (j%2!=0 && i%2!=0&& arr[i][j]<0) {
					
					sum+=Math.abs(arr[i][j]);
				}
			}
			
			
		}
		return sum;
	}
	
	public static int[][] mas(int[][]arr) {
		Random rand = new Random();
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=rand.nextInt(100)-30;
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
