
public class NumberOfWaysToReachNthStair {

	public static int calc(int n){
		//ways to go from ith stair to jth stair
		int[] t = new int[n+1];
		int i;
		t[1] = 1;
		if(n>=2){
			t[2] = 2;
		}
		for(i=3;i<=n;i++){
			t[i] = t[i-1]+t[i-2];
		}
		System.out.println(t[n] + "!");
		return t[n];
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		calc(n);
	}

}
