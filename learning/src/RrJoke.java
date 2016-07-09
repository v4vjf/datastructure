import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class RrJoke {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t,n,xor,i;
		 t = Integer.parseInt(in.readLine());
		 for(;t>0;t--){
			 xor = 1;
			 
			 n = Integer.parseInt(in.readLine());
			 for(i = 0;i<n;i++){
				 in.readLine();
			 }
			 for(;n>1;n--){
				 xor = xor ^ n;
			 }
			 out.write(xor + "\n");
			 out.flush();
		 }
	}

}
