
public class test {

	static int[][] arr = {{0,8},
	{1,2,4},
	{2,1,3,5},
	{3,2,6},
	{4,1,5,7},
	{5,2,6,8,4},
	{6,5,3,9},
	{7,4,8},
	{8,5,9,0,7},
	{9,8,6}};
	static int[] c = new int[599];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		int j;
		for(int i=0;i<=9;i++){

				for(j=0;j<arr[i].length;j++){

					for(int k=0;k<arr[(arr[i][j])].length;k++){

						
							System.out.print(i+""+arr[i][j] + "" + arr[arr[i][j]][k] +" ");
						
							
					}
					System.out.println();
				}
		}
	}

}



