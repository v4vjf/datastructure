
public class MaxHistogramArea {

	/**
	 * @param args
	 */
	public static int maxHistogramArea(int[] arr){
		int[] stack = new int[arr.length];
		int top=0,i=0,maxArea=0;
		int temp;
		stack[0] = i++;
		while(i<arr.length){
			if(top>-1){
				if(arr[i] >= arr[stack[top]]){
					top++;
					stack[top] = i;
					i++;
				}
				else{
					temp = top;
					top--;
					maxArea = max(maxArea,arr[stack[temp]]*(i-stack[temp]));

				}
			}
			else{
				stack[++top] = i++;
			}
		}
		if(top>-1){
			while(top>-1){
				temp = top;
				top--;
				if(top>-1){
					maxArea = max(maxArea,arr[stack[temp]]*(i-stack[temp]));
				}
				else{
					maxArea = max(maxArea,arr[stack[temp]]*i);
				}
			}
		}
		System.out.println("max area is " + maxArea);
		return maxArea;
		
	}
	public static int max(int a, int b){
		return (a>b)?a:b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,3,2};
		maxHistogramArea(arr);
	}

}
