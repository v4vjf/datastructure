
public class MinNumberOfCoinsToMakeChange {

	public static int calc(int v, int[] coins){
		int[] table = new int[v+1];
		int i,j;
		int n = coins.length;
		for(i=1;i<=v;i++){
			table[i]= Integer.MAX_VALUE;
		}
		
		for(i=1;i<=v;i++){
			for(j=1;j<=n;j++){
				if(coins[j-1]<=i){
					int subRes = table[i-coins[j-1]];
					if(subRes != Integer.MAX_VALUE && 1+subRes < table[i]){
						table[i] = subRes+1;
					}
				}
			}
		}
		System.out.println(table[v]+"!");
		return table[v];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins ={9, 6, 4, 1};
		int v = 11;
		calc(v,coins);
	}

}
