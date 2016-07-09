
public class MaxNumberOfA {

	public static int calc(int n){
		if(n<=6){
			System.out.println(n+"!");
			return n;
		}
		int i;
		int[] table = new int[n+1];
		for(i=1;i<=6 ;i++){
			table[i] = i;
		}
		for(i=7;i<=n;i++){
			int b;
			for(b=1;b<=i-3;b++){
				table[i] = UtilClass.max(table[i],(i-b-1)*table[b]);
			}
			
		}
		System.out.println(table[n] + "! ");
		return table[n];

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(;i<=20;i++)
		calc(i);
	}

}
