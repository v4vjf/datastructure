import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Twostr {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int i,t= Integer.parseInt(in.readLine());
		 char[] x,y;
		 boolean flag;
		 for(;t>0;t--){
			 flag = true;
			 x = in.readLine().toCharArray();
			 y = in.readLine().toCharArray();
			 if(x.length != y.length){
				 out.write("No\n");
				 out.flush();
				 continue;
			 }
			 for(i=0;i<x.length;i++){
				 if(x[i] != '?' && y[i] != '?'){
					 if(x[i] != y[i]){
						 flag = false;
						 out.write("No\n");
						 out.flush();
						 break;
					 }
				 }
			 }
			 if(flag == true){
				 out.write("Yes\n");
				 out.flush();
			 }
		 }
		 
	}

}
