
public class FloydWarshall {

	public static final int INF = 9999;
	public static int[][] floydWarshall(int matrix[][]){
		int i,j,k;
		int n = matrix.length;
		for(k=0;k<n;k++){
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					if(matrix[i][j] > matrix[i][k] + matrix[k][j]){
						matrix[i][j] = matrix[i][k] + matrix[k][j];
					}
				}
			}
		}
		return matrix;
	}
	public static void printMatrix(int[][] matrix){
		int i,j;
		int n = matrix.length;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(matrix[i][j] + "					");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { {0,   5,  INF, 10},
                {INF,  0,  3,  INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0} };
		printMatrix(matrix);
		
		System.out.println("_______________________________\n");
		printMatrix(floydWarshall(matrix));
	}

}
