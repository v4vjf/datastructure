
public class ShortestCommonSuperSequence {
	static int[][] table;
	public static int calc(String a, String b, int m, int n){
		if(m==0){
			System.out.println("---" + n +"\n");
			table[m][n] = n;
		}
		else{
			if(n==0){
				System.out.println("---" + m +"\n");

				table[m][n] = m;
			}
			else{
				if(table[m][n] == -1){
					if(a.charAt(m-1) == b.charAt(n-1)){
						table[m][n] = 1 + calc(a,b,m-1,n-1);
					}
					else{
						table[m][n] = 1 + UtilClass.min(calc(a,b,m-1,n), calc(a,b,m,n-1));
					}
				}
			}
		}
		return table[m][n];
	}
	
	public static int init(String a, String b){
		int m = a.length();
		int n = b.length();
		table = new int[m+1][n+1];
		int i,j;
		for(i=0;i<=m;i++){
			for(j=0;j<=n;j++){
				table[i][j] = -1;
			}
		}
		System.out.println(calc(a,b,m,n) + "!");
		UtilClass.printMatrix(table);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X = "AGGTAB";
		String Y = "GXTXAYB";
		init(X,Y);
	}

}
