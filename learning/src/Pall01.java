import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Pall01 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int i,l,j,t = Integer.parseInt(in.readLine());
		 boolean flag;
		 for(;t>0;t--){
			 String str = in.readLine();
			 l = str.length();
			 flag = true;
			
			 for(i=0,j=(l-1);i<=l/2;i++,j--){
				 
				 if(str.charAt(i) != str.charAt(j)){
					 flag = false;
					 out.write("losses\n");
					 out.flush();
					 break;
				 }
				 
			 }
			 if(flag == true ){
				 out.write("wins\n");
				 out.flush();
				 
			 }
					 
		 }
	}

}
