import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Trisq {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t, arr[], i;
		 arr = new int[10001];
		 arr[0]=arr[1]=arr[2]=arr[3]=0;
		 arr[4] = 1;
		 
		 for(i=5;i<=10000;i++){
			 arr[i] = (i/2)*((i/2)-1)/2;
		 }
		 t = Integer.parseInt(in.readLine());
		 for(;t>0;t--){
			 out.write(arr[Integer.parseInt(in.readLine())]+ "\n");
			 out.flush();
		 }
	}
}
