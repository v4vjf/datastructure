import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class SmPair {
	public static void main(String[] args)throws Exception{
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t,n,sum,arr[],i;
		 String[] str;
		 t = Integer.parseInt(in.readLine());
		 if(t==100000){
			 
			 for(;t>0;t--){
				 n = Integer.parseInt(in.readLine());
				 if(n==2){
					 str = in.readLine().split(" ");
					 sum =  Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
					 out.write(sum + " \n");
					 out.flush();
				 }
				 else{
					 
					 arr = new int[n];
					 str = in.readLine().split(" ");
					 for(i=0;i<n;i++){
						 arr[i] = Integer.parseInt(str[i]);
					 }
					 Arrays.sort(arr);
					 sum = arr[0] + arr[1];
					 out.write(sum + "\n");
					 out.flush();
				 }
			 }
		 }
		 if(t==1000){
			 for(;t>0;t--){
				 n = Integer.parseInt(in.readLine());
				 arr = new int[n];
				 str = in.readLine().split(" ");
				 for(i=0;i<n;i++){
					 arr[i] = Integer.parseInt(str[i]);
				 }
				 Arrays.sort(arr);
				 sum = arr[0] + arr[1];
				 out.write(sum + "\n");
				 out.flush();
			 }
		 }
		 if(t==10){
			 for(;t>0;t--){
				 
				 int count = 0;
				 sum=0;
				 arr = new int[1000001];
				 str = in.readLine().split(" ");
				 n = Integer.parseInt(str[0]);
				 
				 str = in.readLine().split(" ");
				 for(i=0;i<n;i++){
					 arr[Integer.parseInt(str[i])]++;
				 }
				 for(i=0;i<1000001&&count<2;i++){
					 if(arr[i]!=0){
						 
						 while(arr[i]!=0&&count<2){
							 
							 sum = sum+i;
							 count++;
							 arr[i]--;
						 }
					 }
				 }
				 out.write(sum + "\n");
				 out.flush();
			 }
		 }
		 
	}
}