import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Flow006 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t,sum,l,i;
		 String str;
		 t = Integer.parseInt(in.readLine());
		 for(;t>0;t--){
			 str = in.readLine();
			 sum =0;
			 l = str.length();
			 for(i=0;i<l;i++){
				 sum = sum + str.charAt(i) - '0';
			 }
			 out.write(sum + "\n");
			 out.flush();
		 }
	}

}
