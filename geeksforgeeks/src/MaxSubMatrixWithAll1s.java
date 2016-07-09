
public class MaxSubMatrixWithAll1s {

	public static int max1s(int[][] matrix){
		int[] row = new int[matrix[0].length];
		int i,j,maxArea = -1;
		for(i=0;i<matrix.length;i++){
			for(j=0;j<matrix[0].length;j++){
				if(matrix[i][j] == 0){
					row[j] = 0;
				}
				else{
					row[j] ++;
				}
			}
			maxArea = MaxHistogramArea.max(maxArea,MaxHistogramArea.maxHistogramArea(row));
		}
		System.out.println("maxAreaRectangle of ALL 1s is   " + maxArea);
		return maxArea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { {0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0},
              };
		max1s(mat);
		
	}

}


