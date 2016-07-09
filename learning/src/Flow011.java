import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;


public class Flow011 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t = Integer.parseInt(in.readLine());
		 String str;
		 double sal;
		 for(;t>0;t--){
			 sal = Double.parseDouble(in.readLine());
			 if(sal>=1500){
				 sal = sal + 500 + (.98*sal);
				 out.write(String.format("%.1f\n",sal));
				 out.flush();
			 }
			 else{
				 sal = sal + (.1*sal) + (.9*sal);
				 out.write(String.format("%g1\n",sal));
				
				 out.flush();
			 }
		 }
	}

}
