import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Flow009 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t,q;
		 String[] str;
		 double price,total;
		 t = Integer.parseInt(in.readLine());
		 for(;t>0;t--){
			 str = in.readLine().split(" ");
			 q = Integer.parseInt(str[0]);
			 price = Double.parseDouble(str[1]);
			 total = price * q;
			 if(q>=1000){
				 total = 0.9*total;
			 }
			 out.write(String.format("%.6f\n",total));
			 out.flush();
		 }
		 
	
	}

}
