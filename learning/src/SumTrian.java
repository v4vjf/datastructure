    /* package codechef; // don't place package name! */
     
    import java.io.*;
    public class SumTrian {static int max(int a, int b){
    		return (a>b)?a:b;
    	}
    	static int maxOfArrayPart(int[] arr,int from, int to){
    		int max= arr[from];
    		for(int i = from+1 ;i<=to;i++){
    			max = (arr[i]>max)?arr[i] : max;
    		}
    		return max;
    	}
    	public static void main(String[] args)throws Exception{
    		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
    		int n;//number of test cases;
    		n = Integer.parseInt(in.readLine().trim());
    		for(;n>0;n--){
    			int rows,nos,i,k,j;
    			rows = Integer.parseInt(in.readLine().trim());
    			nos = rows*(rows+1)/2;
    			if(rows ==1){
    			int no = Integer.parseInt(in.readLine().trim());
    			System.out.println(no);
    			}
    			else{
    			int a[] = new int[nos];
    			String[] s;
    			for(i=1,k=0;i<=rows;i++){
    				s = in.readLine().trim().split(" ");
    				for(j=0;j<i;j++,k++){
    					
    					a[k] = Integer.parseInt(s[j]);
    				}
    			}
    			int max[] = new int[nos];
    			max[0] = a[0];
    			max[1] = a[0] + a[1];
    			max[2] = a[0] + a[2];
    			for(i=3,k=3;i<=rows;i++){
    				for(j=1;j<=i;j++,k++){
    					if(j==1){
    						max[k] = max[k-i+1] + a[k];
    					}
    					else
    						if(j==i){
    							max[k] = max[k-i] + a[k];
    						}
    						else{
    							max[k] = max(max[k-i],max[k-i+1]) + a[k];
    						}
    				}
    			}
    			
    			int last = (rows - 1)*(rows)/2;
    			System.out.println(maxOfArrayPart(max, last, max.length-1));
    			
    		}
    		}
    	}
    }
     
     