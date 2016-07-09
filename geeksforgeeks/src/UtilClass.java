
public class UtilClass {

	private UtilClass(){
	};
	
	public static void printArray(int[] arr){
		int i;
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void printMatrix(int[][] matrix){
		int i,j;
		for(i=0;i<matrix.length;i++){
			for(j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int min(int a, int b){
		return (a<b)?a:b;
	}
	
	public static int max(int a, int b){
		return (a>b)?a:b;
	}

}
