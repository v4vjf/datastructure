
public class NonDecreasingNumbersWithNDigits {

	public static int calc(int n){
		int[][] table = new int[n+1][10];
		int i,j;
		for(i=0;i<=9;i++){
			table[1][i] = 1;
		}
		for(i=0;i<=n;i++){
			table[i][0] = 1;
		}
		for(i=1;i<=n;i++){
			for(j=1;j<=9;j++){
				table[i][j] = table[i][j-1]+table[i-1][j];
			}
		}
		System.out.println(getSum(table[n])+"!");
		printMatrix(table);
		return getSum(table[n]);
	}
	
	public static int getSum(int[] arr){
		int sum=0;
		for(int temp:arr){
			sum +=temp;
		}
		return sum;
	}
	
	public static void printMatrix(int[][] matrix){
		int i,j;
		for(i=0;i<matrix.length;i++){
			for(j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc(3);
	}

}
