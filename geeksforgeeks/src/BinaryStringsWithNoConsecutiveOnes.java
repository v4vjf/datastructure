
public class BinaryStringsWithNoConsecutiveOnes {

	public static int calc(int n){
		int arr1[] = new int[n+1];
		int arr0[] = new int[n+1];
		arr1[1] = arr0[1] = 1;
		for(int i=2;i<=n;i++){
			arr0[i] = arr1[i-1] + arr0[i-1] ;
			arr1[i] = arr0[i-1];
		}
		return (arr1[n] + arr0[n]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calc(0)+"");
	}

}
