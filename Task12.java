package by.ad.les08_2;



public class Task12 {

	public static void main(String[] args) {
		int n;		
		n=5;
		
		
		int[][] arr = new int[n][n];
		arr=mas(arr);
		printArr(arr);

	}
	
	public static int[][] mas(int[][]arr) {
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				if(i==j) {
					arr[i][j]=i;
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
