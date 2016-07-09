
public class BooleanParenthesization {

	/**
	 * @param args
	 */
	
	public static int calc(char[] sym,char[] op){
		int n = sym.length;
		
		int[][] t = new int[n+1][n+1];
		int[][] f = new int[n+1][n+1];
		
		int i,j,k;
		
		for(i=1;i<=n;i++){
			if(sym[i-1] == 't'){
				t[i][i] = 1;
				f[i][i] = 0;
				System.out.println("true" + t[i][i] +" "+f[i][i]);

			}
			else{
				t[i][i] = 0;
				f[i][i] = 1;
				System.out.println("false"+ t[i][i] +" "+f[i][i]);

			}
		}
		//len is the number of symbols being processed at a time
		int len = 2;
		
		for(;len<=n;len++){
			for(i=1;i <= n-len+1;i++){
				j = i+len-1;
				t[i][j] = 0;
				f[i][j] = 0;
				for(k=i;k<j;k++){
					if(op[k-1] == '&'){//op[k-1] is the kth operator
					
						System.out.println("&");
						t[i][j] += (t[i][k] * t[k+1][j]);
						f[i][j] += ((t[i][k]*f[k+1][j]) + (f[i][k]*t[k+1][j]) + (f[i][k] * f[k+1][j]));
					}
					if(op[k-1] == '^'){
						System.out.println("^");
						t[i][j] += ((t[i][k]*f[k+1][j]) + (f[i][k]*t[k+1][j]));
						f[i][j] += ((t[i][k] * t[k+1][j]) + (f[i][k] * f[k+1][j]));
					}
						
					if(op[k-1] ==  '|'){
						System.out.println("|");
						t[i][j] += ((t[i][k]*f[k+1][j]) + (f[i][k]*t[k+1][j]) + (t[i][k] * t[k+1][j]));
						f[i][j] += (f[i][k] * f[k+1][j]);
					}
				}
			}

		}
		System.out.println("" +t[1][n] );
		return t[1][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char symbols[] = {'t','t','f','t'};
	    char operators[] = {'|','&','^'};
	    calc(symbols,operators);
	}

}
