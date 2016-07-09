
public class SubsetSum {

	public static boolean calc(int[] arr,int sum){
		int n = arr.length;
		boolean[][] table = new boolean[sum+1][n+1];
		int i,j;
		for(i=0;i<=sum;i++){
			table[i][0] = false;

		}
		for(i=0;i<=n;i++){
			table[0][i] = true;
		}
		
		for(i=1;i<=sum;i++){
			for(j=1;j<=n;j++){
				if(arr[j-1]<=i){
					table[i][j] = table[i-arr[j-1]][j-1];
				}
				table[i][j] = table[i][j] || table[i][j-1];
			}
		}
		return table[sum][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 34, 4, 12, 5, 2};
		int sum = 1;
		System.out.println(calc(arr,sum) + "");
	}

}
