package by.ad.les08_2;
import java.util.Arrays;
import java.util.Random;
/*
 * 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
 */
public class Task02 {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];
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
	}

}
