
public class MaxPointsInAGridUsingTwoTraversal {
	
	static int table[][][];
	public static int init(int[][] grid){
		int r=grid.length;
		int c=grid[0].length;
		table = new int[r][c][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				for(int k=0;k<c;k++){
					table[i][j][k] = -1;
				}
			}
		}
		int temp=0;
		int total = grid[0][0] + grid[0][c-1];
		
		temp = UtilClass.max(temp,calc(grid,1,0,0));
		temp = UtilClass.max(temp,calc(grid,1,0,-1));
		temp = UtilClass.max(temp,calc(grid,1,1,0));
		temp = UtilClass.max(temp,calc(grid,1,1,-1));
		
		total = total + temp;
		System.out.println(total + "!");
		
		return total;
	}
	public static int calc(int[][] grid, int r, int c1,int c2){
		if(isInvalid(grid,r,c1,c2)){
			return Integer.MIN_VALUE;
		}
		else{//either path 1 or path2 has reached last row but not there desination
			if(r==grid.length-1 && (c1 != 0||c2 !=grid[0].length-1)){
				return table[r][c1][c2] = Integer.MIN_VALUE;
			}
			else{
				//both reached the destination
				if(r==grid.length-1&&c1==0&&c2==grid[0].length-1){
					return table[r][c1][c2] = grid[r][c1] + grid[r][c2]; 
				}
				else{
				//if the result is not yet calculated
					if(table[r][c1][c2] == -1){
						int temp = 0;
						temp = UtilClass.max(temp,calc(grid,r+1,c1+0,c2+0));
						temp = UtilClass.max(temp,calc(grid,r+1,c1+0,c2-1));
						temp = UtilClass.max(temp,calc(grid,r+1,c1+0,c2+1));
						temp = UtilClass.max(temp,calc(grid,r+1,c1+1,c2+0));
						temp = UtilClass.max(temp,calc(grid,r+1,c1+1,c2-1));
						temp = UtilClass.max(temp,calc(grid,r+1,c1+1,c2+1));
						temp = UtilClass.max(temp,calc(grid,r+1,c1-1,c2+0));
						temp = UtilClass.max(temp,calc(grid,r+1,c1-1,c2-1));
						temp = UtilClass.max(temp,calc(grid,r+1,c1-1,c2+1));
						table[r][c1][c2] = temp + grid[r][c1] + grid[r][c2];
					}
				}
			}
		}
		return table[r][c1][c2];
	}
	
	public static boolean isInvalid(int[][] grid, int r, int c1, int c2){
		if(r<0||r>=grid.length||c1<0||c2<0||c1>=grid[0].length||c2>=grid[0].length){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[][] = {{3, 6, 8, 2},
                {5, 2, 4, 3},
                {1, 1, 20, 10},
                {1, 1, 20, 10},
                {1, 1, 20, 10},
               };
		init(arr);
	}

}
