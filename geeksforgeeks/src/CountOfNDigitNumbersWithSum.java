
public class CountOfNDigitNumbersWithSum {
	static int[][] table;
	
	public static int init(int n, int sum){
		if(n==0||sum==0){
			return 0;
		}
		table = new int[sum+1][n+1];
		for(int i=0;i<=sum;i++){
			for(int j=0;j<=n;j++){
				table[i][j] = -1;
			}
		}
		int temp =0;
		for(int i=1;i<=9;i++){
			if(i<=sum){
				temp += calc(n-1,sum-i);
			}
		}
		return temp;
	}
	
	public static int calc(int n, int sum){
		if(sum==0){
			table[sum][n] = 1;
		}
		else{
			if(n==0){
				table[sum][n] = 0;
			}
			else
				if(table[sum][n] == -1){
					table[sum][n] =0;
					for(int i=0;i<=9;i++){
						if(i<=sum){
							table[sum][n] += calc(n-1,sum-i);
						}
				}
			}
		}		
		return table[sum][n];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(init(3,6)+"!");
	}

}
