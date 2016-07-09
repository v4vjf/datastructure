import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Fsqrt {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t;
		t= Integer.parseInt(in.readLine());
		for(;t>0;t--){
			out.write((int)(Math.sqrt(Integer.parseInt(in.readLine()))) + "\n");
			out.flush();
		}
		
	}

}
