
public class MinInitialPointsToReachDestination {

	public static int calc(int[][] mat){
		int r = mat.length-1;
		int c = mat[0].length-1;
		
		int[][] table = new int[r+1][c+1];
		
		if(mat[r][c]<0){
			table[r][c] = 1-mat[r][c];
		}
		else{
			mat[r][c] = 1;
		}
		//filling last column
		for(r=r-1;r>=0;r--){
			if(mat[r][c] < 0){
				table[r][c] = table[r+1][c] - mat[r][c];
			}
			else{
				table[r][c] = max(table[r+1][c]-mat[r][c],1) ;
			}
		}
		c= mat[0].length-2;
		r=mat.length-1;
		for(;c>=0;c--){
			if(mat[r][c]<0){
				table[r][c] = table[r][c+1] - mat[r][c];
			}
			else{
				table[r][c] = max((table[r][c+1] - mat[r][c]),1);
			}
		}
		r = mat.length-2;
		c = mat[0].length-2;
		for(r = mat.length-2;r>=0;r--){
			for(c = mat[0].length-2;c>=0;c--){
				if(mat[r][c]<0){
					table[r][c] = min(table[r+1][c],table[r][c+1]) - mat[r][c];
				}
				else{
					table[r][c] = max(min(table[r+1][c],table[r][c+1]) -mat[r][c], 1);
				}
			}
		}
		System.out.println(table[0][0]+"!");
		printMatrix(table);
		return table[0][0];
	}
	
	public static int min(int a, int b){
		return (a<b)?a:b;
	}
	
	public static int max(int a, int b){
		return (a>b)?a:b;
	}
	public static void printMatrix(int[][] matrix){
		int i,j;
		for(i=0;i<matrix.length;i++){
			for(j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int points[][] = { {-2,-3,3},
                {-5,-10,1},
                {10,30,-5}
              };
		calc(points);
	}

}
