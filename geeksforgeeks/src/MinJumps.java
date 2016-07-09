
public class MinJumps {

	/**
	 * @param args
	 */
	public static int minJumps(int[] arr){
		int[] jump = new int[arr.length];
		int i,k;
		for(i=1;i<arr.length;i++){
			jump[i] = 99999;
		}
		for(i=0;i<arr.length;i++){
			if(arr[i] != 0){
				for(k=i+1;k<=i+arr[i]&&k<arr.length;k++){
					if(jump[k]>jump[i]+1){
						jump[k]=jump[i]+1;
					}
				}
			}
		}
		System.out.println("jumps = " + jump[arr.length-1]);
		return jump[arr.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		minJumps(arr);
	}

}
