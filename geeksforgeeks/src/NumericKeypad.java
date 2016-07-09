
public class NumericKeypad{
	static int x[] = {0,1,-1,0,0};
	static int y[] = {0,0,0,1,-1};
	static char[][] keypad = {{'1','2','3'},
						{'4','5','6'},
						{'7','8','9'},
						{'*','0','#'}
	};
	
					
					
	
	
	public static int calc(int n){
		//table[i][j] holding count of numbers of length i, beginning with digit j
		int[][] table= new int[n+1][10];
		int i,j;
		for(i=0;i<=9;i++){
			//count of numbers of zero length = 0
			table[0][i] = 0;
			//count of numbers of length 1 starting at any digit is 1
			table[1][i] = 1;
		}
		
		int source,dest;
		
		int len;
		int r,c,move;
		
		for(len=2;len<=n;len++){
			for(i=0;i<=3;i++){
				for(j=0;j<=2;j++){
					if(keypad[i][j] != '*' && keypad[i][j] != '#'){
						System.out.println(keypad[i][j]+"");
						source = keypad[i][j] - '0';
						for(move=0;move<5;move++){
							r = i + y[move];
							c = j + x[move];
							if(r>=0&&r<=3&&c<=2&&c>=0){
								if(keypad[r][c] != '*' && keypad[r][c] != '#'){
									dest = keypad[r][c] - '0';
									table[len][source] = table[len][source] + table[len-1][dest];
								}
							}
						}
					}
				}
			}
		}
		System.out.println(sum(table[n])+"!");
		print(table);
		return sum(table[n]);
	}
	
	public static void print(int[][] mat){
		int i,j;
		for(i=0;i<mat.length;i++){
			for(j=0;j<mat[0].length;j++)
				System.out.print("  " + mat[i][j]);
			System.out.println();
		}
	}
	
	private static int sum(int[] arr){
		int sum = 0;
		for(int item:arr){
			sum += item;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc(5);
		

	}

}
