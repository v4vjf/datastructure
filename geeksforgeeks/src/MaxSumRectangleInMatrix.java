
public class MaxSumRectangleInMatrix {
	public static int maxSum(int[][] matrix){
		int l,r;
		int rows = matrix.length;
		int col = matrix[0].length;
		int[] ret;
		int max = 0;
		int maxL,maxR,maxUp,maxDown;
		
		int i;
		for(l=0;l<col;l++){
			int[] temp = new int[rows];
			for(r=l;r<col;r++){
				for(i=0;i<rows;i++){
					temp[i] = temp[i] + matrix[i][r]; 
				}
				ret = maxSumContiguousSubArr(temp);
				if(max<ret[2]){
					maxL=l;
					maxR=r;
					max = ret[2];
					maxUp = ret[0];
					maxDown = ret[1];
				}
			}
		}
		return max;
	}
	public static int[] maxSumContiguousSubArr(int[] arr){
		int i,maxL=0,maxR=0;
		int maxHere=0,max=0;
		for(i=0;i<arr.length;i++){
			maxHere = maxHere +arr[i];
			if(maxHere<0){
				maxL=i;
				maxR=i;
				maxHere = 0;
			}
			else{
				if(maxHere>max){
					max = maxHere;
					maxR=i;
				}
			}
		}
		int[] ar = {maxL,maxR,max};
		return ar;
		
	}
	public static int max(int a, int b){
		return (a>b?a:b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr =  {{1, 2, -1, -4, -20},{1,1,0,0,0}
                };
		System.out.println(maxSum(arr)+"");

	}

}
