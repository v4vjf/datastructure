
public class OptimalBinarySearchTree {
	static int[][] table;
	static int[][] sum;
	public static int optCost(int[] keys, int[] freq){
		int n = keys.length;
		table = new int[n][n];
		sum = new int[n][n];
		int i,j,k;
		for(i=0;i<n;i++){
			table[i][i] = sum[i][i] = freq[i];
		}
		int l;//length of the chain of keys
		for(l=2;l<=n;l++){
			for(i=0;i<=n-l;i++){
				j=i+l-1;
				table[i][j] = Integer.MAX_VALUE;
				for(k=i;k<=j;k++){
					{
						int temp = sum(freq,i,j) + ((k>i)?table[i][k-1]:0) + ((k<j)?table[k+1][j]:0);
						if(temp<table[i][j]){
							table[i][j] = temp;
						}
					}
				}
			}
		}
		System.out.print("\n"+table[0][n-1]);
		return table[0][n-1];
	}
	public static int sum(int[] freq, int i, int j){
		if(sum[i][j] == 0){
			int temp = 0,count=i;
			for(;count<=j;count++){
				temp = temp + freq[count];
			}
			sum[i][j] = temp;
		}
		return sum[i][j];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int keys[] = {10, 12, 20};
	    int freq[] = {34, 8, 50};
	    optCost(keys,freq);
	}

}
