
public class MaxLengthChainOfPairs {

	/**
	 * @param args
	 */
	public static int maxLengthChainOfPairs(int[][] a){
		int[] mcl = new int[a.length];
		int i,j;
		for(i=0;i<mcl.length;i++){
			mcl[i] = 1;
		}
		for(i=1;i<mcl.length;i++){
			for(j=0;j<i;j++){
				System.out.print("\n"+a[i][0] +"," + a[i][1] + " " + a[j][0] + "," +a[j][1] );
				
				if(a[i][0]>a[j][1] && mcl[i]<mcl[j]+1){
					
					System.out.print("  " + a[i][0] + " > " + a[j][1] + "		true\n"); 
					mcl[i] = mcl[j] + 1;
				}
			}
		}
		int max = 0;
		for(i=0;i<mcl.length;i++){
			if(max<mcl[i]){
				max = mcl[i];
			}
		}
		System.out.println(max + "");
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] chain = { {5, 24}, {15, 25},
                {27, 40}, {50, 60} };
		maxLengthChainOfPairs(chain);
	}

}
