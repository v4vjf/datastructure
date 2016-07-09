
public class LongestPalindrome {

	public static int longesPalindrome(String string){
		int n = string.length();
		int[][] table = new int[n][n];//max length of palindrome sequence from i to j
		boolean[][] isPal = new boolean[n][n];//true if i to j is a palindrome
		int i,j;
		int l;//length of string to be processed
		
		
		//single character is a palindrom of length 1
		for(i=0;i<n;i++){
			isPal[i][i] = true;
			table[i][i] = 1;
		}
		for(l=2;l<=n;l++){
			for(i=0;i<=n-l;i++){
				j = i + l - 1;//end index
				if(l==2){
					if((string.charAt(i) == string.charAt(j))){//checking for palindrome length 2
						isPal[i][j] = true;
						table[i][j] = 2;
					}
				}
				else{
					if(string.charAt(i) == string.charAt(j)){
						isPal[i][j] = isPal[i+1][j-1];
						if(isPal[i][j]){
							table[i][j] = table[i+1][j-1] + 2;
						}
					}
				}
			}
		}
		return findMax(table);//returning the max value of table
	}
	public static int findMax(int[][] mat){
		int i,j;
		int max=1;
		for(i=0;i<mat.length;i++){
			for(j=0;j<mat.length;j++){
				System.out.print("  " + mat[i][j]);
				max = (mat[i][j] > max)?mat[i][j] : max;
			}
			System.out.println();
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "forgeeksskeegfor";
		System.out.println(longesPalindrome(string) + "");
		
	}

}
