
public class PalindromePartitioning {

	/**
	 * @param args
	 */
	public static int palindromePartitioning(String string){
		int n = string.length();
		boolean p[][] = new boolean[n][n];
		int c[][] = new int[n][n];
		int i,j,k,l;
		
		
		
		for(i=0;i<n;i++){
			p[i][i] = true;
			c[i][i] = 0;
		}	
		for(l=2;l<=n;l++){
			for(i=0;i<=n-l;i++){
				j = i+ l -1;
				if(l == 2){
					if(string.charAt(i) == string.charAt(j)){
						c[i][j] = 0;
						p[i][j] = true;
					}
				}
				else
				{
					if(string.charAt(i) == string.charAt(j) && p[i+1][j-1]){
						c[i][j] = 0;
						p[i][j] = true;
					}
				
					else{
						c[i][j] = Integer.MAX_VALUE;
						for(k=i;k<j;k++){
							c[i][j] = min(c[i][j],c[i][k] + c[k+1][j] + 1);
						}
					}
				}
			}
		}
		return c[0][n-1];
	}
	public static int min(int a, int b){
		if(a<b)
			return a;
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "ababbbabbababa";
		System.out.println(palindromePartitioning(string) + "!");
		
	}

}
