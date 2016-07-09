
public class TriangluationOfConvexPolygon {

	public static double calc(int[][] points){
			
		
		//number of points		
		int n = points.length;
		
		//table[i][j] has min cost of triangulation for vertices i to j;
		double[][] table = new double[n+1][n+1];
		
		//len denotes the number of vertices considered
		int len = 3;
		
		int i,j,k;
		
		for(len=3;len<=n;len++){
			for(i=1;i<=n-len+1;i++){
				j=i+len-1;
				table[i][j] = Double.MAX_VALUE;
				for(k=i+1;k<=j-1;k++){
					double temp = table[i][k]+table[k][j]+cost(points[i-1],points[k-1],points[j-1]);
					table[i][j] = min(table[i][j],temp);
				}
			}
		}
		System.out.println(table[1][n] + "!");
		return table[1][n];
	}
	
	//cost(a,b,c) returns the perimeter of triable formed by vertices a,b,c
	private static double cost(int[] a, int[] b, int[] c){
		return  (dist(a,b) + dist(b,c) + dist(a,c) );
	}
	
	//dist(a,b) returns the distance between points a,b
	private static double dist(int[] a, int[] b){
		return java.lang.Math.sqrt ( (double) (((a[0]-b[0])*(a[0]-b[0])) + ((a[1]-b[1])*(a[1]-b[1]))) );
	}
	
	private static double min(double a, double b){
		return (a<b)?a:b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {{0, 0}, {3, 0}, {0, 4}};
		calc(points);
	}

}
