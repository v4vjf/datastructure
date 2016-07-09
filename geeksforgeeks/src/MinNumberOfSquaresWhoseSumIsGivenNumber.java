
public class MinNumberOfSquaresWhoseSumIsGivenNumber {
	static int table[];
	public static int init(int n){
		table = new int[n+1];
		int i;
		for(i=0;i<=n;i++){
			table[i] = -1;
		}
		int temp = Integer.MAX_VALUE;
		for(i=1;i*i<=n;i++){
			temp = UtilClass.min(temp,1+calc(n-(i*i))); 
		}
		System.out.println(temp+"!");
		UtilClass.printArray(table);
		return temp;
	}
	public static int calc(int n){
		if(table[n] == -1){
			if(n<=3){
				return table[n] = n;
			}
			int x;
			int count=Integer.MAX_VALUE;
			for(x=1;x*x<=n;x++){
				count = UtilClass.min(count,1+calc(n-(x*x)));
			}
			table[n] = count;
		}
		return table[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init(6);
	}

}
