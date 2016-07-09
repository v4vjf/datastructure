
public class PartitionProblem {

	/**
	 * @param args
	 */
	static boolean partitionProblem(int[] arr, int n){
		int i=0,sum = 0;
		for(;i<n;i++){
			sum += arr[i];
		}
		if((sum&1) == 1){
			return false;
		}
		boolean[][] part = new boolean[sum/2 + 1][n+1];
		for(i=0;i<=n;i++){
			part[0][i] = true;
		}
		for(i=0;i<=sum/2;i++){
			for(int j=1;j<=n;j++){
				part[i][j] = part[i][j-1];
				if(i>=arr[j-1]){
					part[i][j] = part[i-arr[j-1]][j-1];
				}
			}
		}
		return part[sum/2][n];
	}
	public static void main (String[] args)
    {
        int arr[] = {1,1};
        int n = arr.length;
        if (partitionProblem(arr, n))
            System.out.println("Can be divided into two subsets of equal sum");
        else
            System.out.println("Can not be divided into two subsets of equal sum");
 
    }

}
