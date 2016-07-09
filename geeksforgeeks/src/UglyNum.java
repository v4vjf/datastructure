
public class UglyNum {
	static int findUglyNum(int n){
		int[] ugly = new int[n];
		ugly[0] = 1;
		int i=0,
				j=0,
				k=0;
		int n2,n3,n5;
		int count;
		for(count=1;count<n;count++){
			n2 = 2*ugly[i];
			n3 = 3*ugly[j];
			n5 = 5*ugly[k];
			
			ugly[count] = min(n2,n3,n5);
			if(ugly[count] == n2){
				i++;
			}
			if(ugly[count] == n3){
				j++;
			}
			if(ugly[count] == n5){
				k++;
			}
			
		}
		return ugly[n-1];
		
	}
	public static int min(int a, int b, int c){
		if(a<=b && a<=c)
			return a;
		if(b<=a && b<=c)
			return b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findUglyNum(150) + " !" );
	}

}
