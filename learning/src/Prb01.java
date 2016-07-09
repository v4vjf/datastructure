import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Prb01 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t,n,i;
		 boolean flag = false;
		 t = Integer.parseInt(in.readLine());
		 for(;t>0;t--){
			 n = Integer.parseInt(in.readLine());
			 flag = true;
			 if((n&1)==0){
				 if(n != 2){
					 out.write("no\n");
				 }
				 else{
					 out.write("yes\n");
				 }
				 out.flush();
				 continue;
			 }
			 for(i=3;i<=n/2;i++){
				 if(n%i == 0){
					 flag = false;
					 break;
				 }
			 }
			 if(flag == false){
				 out.write("no\n");
			 }
			 else{
				 out.write("yes\n");
			 }
			 out.flush();
		 }
	
	}

}
