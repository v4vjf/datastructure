import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Flow013 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int n,a1,a2,a3;
		 String[] str;
		 n = Integer.parseInt(in.readLine());
		 for(;n>0;n--){
			 str = in.readLine().split(" ");
			 a1 = Integer.parseInt(str[0]);
			 if(a1 == 0 ){
				 out.write("NO\n");
				 out.flush();
				 break;
			 }
			 a2 = Integer.parseInt(str[1]);
			 if(a2 == 0 ){
				 out.write("NO\n");
				 out.flush();
				 break;
			 }
			 a3 = Integer.parseInt(str[2]);
			 if(a3 == 0 ){
				 out.write("NO\n");
				 out.flush();
				 break;
			 }
			 if((a1 + a2 + a3) != 180){
				 out.write("NO\n");
				 
			 }
			 else{
				 out.write("YES\n");
			 }
			 out.flush();
			 
		 }
	}

}
