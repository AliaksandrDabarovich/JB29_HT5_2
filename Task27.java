package by.ad.les08_2;
import java.util.Scanner;
import java.util.Random;

/*
 * 27. В числовой матрице поменять местами два столбца любых столбца, 
 * т. е. все элементы одного столбца поставить на соответствующие им 
 * позиции другого, а его элементы второго переместить в первый. 
 * Номера столбцов вводит пользователь с клавиатуры.
 */
public class Task27 {

	public static void main(String[] args) {
		int n;
		int m;
		
		
		
				
		n=3;
		m=4;
		
		int[][] arr = new int[n][m];
		arr=mas(arr);
		printArr(arr);
		calc(arr);
		

	}
	
	public static int scan(String a) {
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Введите "+a+" > ");
		while (sc.hasNextInt()==false) {
			sc.next();
			System.out.println("Введите "+a+" > ");
		}
		c=sc.nextInt();
		return c;
	}
	
	public static void calc (int [][]arr) {
		int a;
		int b;
		int vrem;
		
		a=scan("первый столбец");
		b=scan("второй столбец");
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				if (j==a) {
					vrem=arr[i][j];
					arr[i][j]=arr[i][b];
					arr[i][b]=vrem;
				}
				
				
			}
			
		}
		printArr(arr);
		
		
		
		
	}
	
	
	
	public static int[][] mas(int[][]arr) {
		Random rand = new Random();
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=rand.nextInt(10);
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
