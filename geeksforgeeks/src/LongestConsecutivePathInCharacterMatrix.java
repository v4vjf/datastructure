
public class LongestConsecutivePathInCharacterMatrix {
	static int[][] table;
	static int[] x = {-1,0,1,1,1,0,-1,-1};
	static int[] y = {-1,-1,-1,0,1,1,1,0};
	static int rows;
	static int cols;
	public static int init(char[][] mat, char c){
		rows = mat.length;
		cols = mat[0].length;
		table = new int[rows][cols];
		int i,j;
		int k,l;
		int mov;
		int ans=0;
		//initialising table
		for(i=0;i<rows;i++){
			for(j=0;j<cols;j++){
				table[i][j] = -1;
			}
		}
		for(i=0;i<rows;i++){
			for(j=0;j<cols;j++){
				if(mat[i][j] == c){
					ans = 1;
					for(mov=0;mov<8;mov++){
						k = i + x[mov];
						l = j + y[mov];
						ans = max((getLen(mat,k,l,mat[i][j]) + 1),ans);
					}
					table[i][j] = ans;
				}
			}
		}
		System.out.println(ans+"!");
		return ans;
	}
	
	public static int getLen(char[][] mat,int i, int j, char prev){
		
		if(!isValid(i,j)){
			return 0;
		}
		if(!isAdj(mat[i][j],prev)){
		}
		else{
			if(table[i][j] == -1){
				int k,l,mov,ans=0;
				for(mov=0;mov<8;mov++){
					k=i+x[mov];
					l=j+y[mov];
					ans = max(getLen(mat,k,l,mat[i][j])+1,ans);
				}
				table[i][j] = ans;
			}
		
		}
		return table[i][j];
	}
	public static boolean isAdj(char a, char b){
		if((a-b) == 1){
			return true;
		}
		return false;
	}
	public static boolean isValid(int i, int j){
		if(i<0||j<0||i>=rows||j>=cols)
			return false;
		return true;
	}
	
	public static int max(int a, int b){
		return (a>b)?a:b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] mat = { {'a','c','d'},
                { 'h','b','a'},
                { 'i','g','f'}};
		init(mat,'a');
		init(mat,'e');
		init(mat,'c');
		init(mat,'d');
	}

}
