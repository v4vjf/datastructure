
public class maxHeightBoxStack {

	/**
	 * @param args
	 */
	public static int  maxHeightBoxStack(int[][] box){
		
		int[][] instances = generateInstances(box);
		int[] mhs = new int[instances.length];
		int i,j;
		for(i=0;i<mhs.length;i++){
			mhs[i] = instances[i][0];
		}
		for(i=1;i<mhs.length;i++){
			for(j=0;j<i;j++){
				if(instances[i][1]<instances[j][1] && instances[i][2]<instances[j][2] && mhs[j] + instances[i][0] > mhs[i]){
					mhs[i] = mhs[j] + instances[i][0];
				}
			}
		}
		int maxHeight=0;
		for(i=0;i<mhs.length;i++){
			if(maxHeight<mhs[i]){
				maxHeight = mhs[i];
			}
		}
		System.out.println("\n" +"max height is " + maxHeight + "\n");
		return maxHeight;
	}
	//generate all rotations of boxes and arrange in decreasing order of base area
	public static int[][] generateInstances(int[][] box){
		int i,j=-1;
		int[] arr = new int[3];
		int[][] instances = new int[3*box.length][3];
		for(i=0;i<box.length;i++){
			instances[++j][0] = box[i][0];
			instances[j][1] = min(box[i][1],box[i][2]);
			instances[j][2]= max(box[i][1],box[i][2]);
			instances[++j][0] = box[i][1];
			instances[j][1] = min(box[i][0],box[i][2]);
			instances[j][2] = max(box[i][0],box[i][2]);
			instances[++j][0] = box[i][2];
			instances[j][1] = min(box[i][0],box[i][1]);
			instances[j][2] = max(box[i][0],box[i][1]);
		}
		printInstances(instances);
		System.out.print("\nsorting\n");
		int temp1,temp2,temp0;
		for(j=0;j<instances.length;j++){
			for(i=0;i<(instances.length-1);i++){
				if(area(instances[i])<area(instances[i+1])){
					temp0 = instances[i][0];
					temp1 = instances[i][1];
					temp2 = instances[i][2];
					instances[i][0] = instances[i+1][0];
					instances[i][1] = instances[i+1][1];
					instances[i][2] = instances[i+1][2];
					instances[i+1][0] = temp0;
					instances[i+1][1] = temp1;
					instances[i+1][2] = temp2;				}
			}
		}
		printInstances(instances);
		return instances;
	}
	public static int max(int a, int b){
		return (a>b)?a:b;
	}
	public static int min(int a, int b){
		return (a<b)?a:b;
	}
	public static int area(int[] a){
		return a[1]*a[2];
	}
	public static int[] sort(int[] a){
		int i,j,temp;
		for(i=0;i<a.length;i++){
			for(j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	public static void printInstances(int[][] instances){
		int i;
		for(i=0;i<instances.length;i++){
			System.out.print("\n" + instances[i][0] + "," + instances[i][1] + "," + instances[i][2]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] box = { {4, 6, 7}, {1, 2, 3}, {4, 5, 6}, {10, 12, 32} };
		maxHeightBoxStack(box);
	}

}
