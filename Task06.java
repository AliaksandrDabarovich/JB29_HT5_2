package by.ad.les08_2;
import java.util.Arrays;
import java.util.Random;

/*
 * 6. Дана матрица. Вывести на экран все нечетные столбцы, 
 * у которых первый элемент больше последнего. 
 */
public class Task06 {

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		arr=mas(arr);
		printArr(arr);
		calc(arr);
		
	}
	
	public static void calc(int[][]arr) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				if (j%2!=0 && arr[0][j]>arr[arr[i].length-1][j]) {
					System.out.print(" "+arr[i][j]+" ");
				}
			}
			System.out.println("\n");
			
		}
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
		System.out.println(Arrays.deepToString(arr));
	}

}
