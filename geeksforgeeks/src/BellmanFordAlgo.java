
 class Edge{
	public int src,dest,wt;
	public Edge(int src,int dest, int wt){
		this.src = src;
		this.dest = dest;
		this.wt = wt;
	}
 } 
 public class BellmanFordAlgo {
	 public static final int INF = Integer.MAX_VALUE;
	 public static int shortestPath(Edge[] edge,int v){
		boolean flag = false;
		int[] arr = new int[v];
		int i,j;
		for(i=1;i<arr.length;i++){
			arr[i] = INF;
		}
		arr[0] = 0;
		for(i=1;i<v-1;i++){
			for(j=0;j<edge.length;j++){
                int src = edge[j].src;
                int dest = edge[j].dest;
                int wt = edge[j].wt;
                if(arr[src]!=INF&&arr[dest]>arr[src] + wt){
                	arr[dest] = arr[src]+wt;
                }
			}
		}
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i] +"");
			
		}
		/*for(j=0;j<edge.length && !flag;j++){
			int u = edge[j].src;
            int v = edge[j].dest;
            int weight = edge[j].wt;
            if (arr[u]!=Integer.MAX_VALUE &&
                arr[u]+weight<arr[v]){
            		flag = true;
            		System.out.println("negative found");
            	}
        }
        */
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e = 8;
		int v = 5;
		Edge[] edge = new Edge[8];
		edge[0] = new Edge(0,1,-1);
		edge[1] = new Edge(0,2,4);
		edge[2] = new Edge(1,2,3);
		edge[3] = new Edge(1,3,2);
		edge[4] = new Edge(1,4,2);
		edge[5] = new Edge(3,2,5);
		edge[6] = new Edge(3,1,1);
		edge[7] = new Edge(4,3,-3);
		shortestPath(edge,v);

		
		
	}

}
