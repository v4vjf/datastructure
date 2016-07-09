import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;


public class Gdog {
	static int max(int a, int b){
		return a>b?a:b;
	}
	static int max(int[] arr){
		int i = 1,max = arr[0];
		for(i=1;i<arr.length;i++){
			max = max(max , arr[i]);
		}
		return max;
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int i,t,num,div;
		 String str[];
		 t = Integer.parseInt(in.readLine());
		 for(;t>0;t--){
			 str = in.readLine().split(" ");
			 num = Integer.parseInt(str[0]);
			 div = Integer.parseInt(str[1]);
			 if(num<div){
				 out.write(num + "\n");
			 }
			 
			 if(div==1){
				 out.write("0\n");
			 }
			 if(div>(num>>1)){
				
					 out.write((num-div) + "/n");
				 
			 }
			 else{
				 if(div>(num/3)){
					 out.write(num%((num/3)+1));
				 }
			 
				 else{
					 int[] arr = new int[div+1];
					 for(i=1;i<=div;div++){
						 arr[i] = num%i;
					 }
					 out.write(max(arr)+ "\n");
				 }
			 }	
			 out.flush();
 		 }

	}
}
