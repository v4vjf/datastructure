import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Flow001 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t;
		 t = Integer.parseInt(in.readLine());
		 String[] str;
		 for(;t>0;t--){
			 str = in.readLine().split(" ");
			 out.write((Integer.parseInt(str[0]) + Integer.parseInt(str[1])) + "\n");
			 out.flush();
		 }
	}

}
