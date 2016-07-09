
public class SolveWordWrap {

	/**
	 * @param args
	 */
	static final int INF = Integer.MAX_VALUE;
	public static int[][] computeExtraSpace(int[] words, int lWidth){
		int[][] extraSpace = new int[words.length+1][words.length+1];
		int i,j;
		for(i=1;i<=words.length;i++){
			extraSpace[i][i] = lWidth - words[i-1];
			j = i+1;
			for(;j<=words.length;j++){
				extraSpace[i][j] = extraSpace[i][j-1] - words[j-1] - 1;
			}
		}
		return extraSpace;
	}
	public static int[][] computeCost(int[] words, int lWidth){
		int i,j;
		int costForWords[][] = new int[words.length+1][words.length+1];
		int extraSpace[][] = computeExtraSpace(words,lWidth);
		for(i=1;i<=words.length;i++){
			for(j=1;j<=words.length;j++){
				if(extraSpace[i][j] < 0){
					costForWords[i][j] = INF;
				}
				else{
					if(j==(words.length+1) && extraSpace[i][j] >=0){
						costForWords[i][j] = 0;
					}
					else{
						costForWords[i][j] = extraSpace[i][j]*extraSpace[i][j];
					}
				}
			}
		}
		return costForWords;
	}
	public static int minCost(int[] words, int lWidth){//will return no. of words in each line for min cost arrangement
		int[] minCostUpto = new int[words.length + 1];
		int[] splitAt = new int[words.length + 1];
		int[][] costForWords = computeCost(words,lWidth);
		int i,j;
		for(i=1;i<=words.length;i++){
			minCostUpto[i] = INF;
			for(j=1;j<=i;j++){
				if(costForWords[j][i]!=INF && minCostUpto[j-1]!=INF && minCostUpto[j-1]+costForWords[j][i]<minCostUpto[i]){
					minCostUpto[i] = costForWords[j][i] + minCostUpto[j-1];
					splitAt[i] = j;
				}
			}
		}
		printSolution(splitAt,words.length);
		System.out.println("min cost is " + minCostUpto[words.length]);
		return minCostUpto[words.length];
		
		
		
	}
	public static int min(int a, int b){
		return(a<b)?a:b;
	}
	public static int printSolution (int p[], int n)
	{
	    int k;
	    if (p[n] == 1)
	        k = 1;
	    else
	        k = printSolution (p, p[n]-1) + 1;
	    System.out.print("Line number " + k + " From word no. " + p[n] + "to " + n +"\n");
	    return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,2,5};
		minCost(arr,10);

	}

}
