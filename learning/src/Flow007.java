import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Flow007 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t;
		StringBuffer str;
		t = Integer.parseInt(in.readLine());
		for(;t>0;t--){
			
			str = new StringBuffer(in.readLine());
			str.reverse();
			if((char)str.charAt(0) == '0'){
				do{
					str.deleteCharAt(0);
				}while((char)str.charAt(0) == '0');
			}
			out.write(str.toString());
			out.write("\n");
			out.flush();
		}
	}
}
