package by.ad.les08_2;
/*
 * 16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 */
public class Task16 {

	public static void main(String[] args) {
		int n;		
		n=6;		
		int[][] arr = new int[n][n];
		arr=mas(arr, n);
		printArr(arr);

	}
public static int[][] mas(int[][]arr, int n) {
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				if(j==i) {
					arr[i][j]=(i+1)*(i+2);
				} else {
					arr[i][j]=0;
				}			
				
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
