import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Flow004 {
	public static void main(String [] args)throws Exception{
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int sum,t = Integer.parseInt(in.readLine());
		 String str;
		 
		 for(;t>0;t--){
			 str = in.readLine();
			 if(str.length() == 1){
				 out.write(str+"\n");
			 }
			 else{
				 sum = (int)(str.charAt(0) - '0') + (int)(str.charAt(str.length()-1) - '0'); 
				 out.write(sum + "\n");
			 }
			 
			 out.flush();
		 }
	}
}
