package by.ad.les08_2;
import java.util.Arrays;

/*
 * 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так,
 *  чтобы в одной строке была ровно одна единица, и вывести на экран. 
 */
public class Task01 {

	public static void main(String[] args) {

		int[][] arr = new int[3][4];
		arr=mas(arr);
		print(arr);
		
	}
	public static int [][] mas (int[][] arr) {
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (j == 2) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
		
		
	}
	
	public static void print (int[][] arr) {
		System.out.println(Arrays.deepToString(arr));
	}
	

}
